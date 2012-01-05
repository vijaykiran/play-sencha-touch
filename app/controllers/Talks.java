package controllers;

import models.Talk;
import play.data.binding.As;
import play.db.jpa.JPA;
import play.mvc.Controller;
import utils.SenchaResponseWrapper;
import utils.TalkJsonBinder;

import java.io.IOException;

public class Talks extends Controller {
    //GET {controller}
    public static void index() {
        renderJSON(new SenchaResponseWrapper(true, Talk.findAll()));
    }

    //GET {controller}/id
    public static void show(final String id) {
        final Talk talk = Talk.findById(params.get("id"));
        renderJSON(new SenchaResponseWrapper(true, talk));
    }

    //POST {controller}
    public static void create(@As(binder = TalkJsonBinder.class) Talk talk) throws IOException {
        JPA.em().merge(talk);
        renderJSON(new SenchaResponseWrapper(true, talk));
    }

    //PUT {model}s/{id}
    public static void update(@As(binder = TalkJsonBinder.class) Talk talk) {
        JPA.em().merge(talk);
        renderJSON(new SenchaResponseWrapper(true, talk));
    }

    //DELETE {model}s/{id}
    public static void delete() {
        final Talk talk = Talk.findById(params.get("id"));
        if (talk != null) {
            talk.delete();
        }
        renderJSON(new SenchaResponseWrapper(true, null));
    }


}

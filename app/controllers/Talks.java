package controllers;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import models.Talk;
import play.db.jpa.JPA;
import play.mvc.Controller;
import utils.SenchaResponseWrapper;

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
    public static void create(JsonObject  body) throws IOException {
        Talk talk = new Gson().fromJson(body, Talk.class);
        final Talk result = JPA.em().merge(talk);
        renderJSON(new SenchaResponseWrapper(true, result));
    }

    //PUT {model}s/{id}
    public static void update(JsonObject body) {
        Talk talk = new Gson().fromJson(body, Talk.class);
        final Talk result = JPA.em().merge(talk);
        renderJSON(new SenchaResponseWrapper(true, result));
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

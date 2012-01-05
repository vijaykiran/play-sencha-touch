package controllers;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import models.Talk;
import play.Logger;
import play.db.jpa.JPA;
import play.mvc.Controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Talks extends Controller {
    //GET {controller}
    public static void index() {
        renderJSON(new SenchaItemResponse(true, Talk.findAll()));
    }

    //GET {controller}/id
    public static void show(final String id) {
        Logger.info("show");
    }

    //POST {controller}
    public static void create(JsonObject body) throws IOException {
        Talk talk = new Gson().fromJson(body, Talk.class);
        JPA.em().merge(talk);
        renderJSON(new SenchaItemResponse(true, talk));
    }

    //PUT {model}s/{id}
    public static void update() {
        Logger.info("update");
    }

    //DELETE {model}s/{id}
    public static void delete() {
        Logger.info("delete");
    }

    private static class SenchaItemResponse {
        private boolean success;
        private List items;

        private SenchaItemResponse(boolean success, List items) {
            this.success = success;
            this.items = items;
        }
        
        private SenchaItemResponse(boolean success, Object item) {
            this.success = success;
            this.items = new ArrayList();
            this.items.add(item);
        }
        
        
    }
    
}

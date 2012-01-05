package controllers;

import models.Talk;
import play.Logger;
import play.db.jpa.Model;
import play.mvc.Controller;

import java.util.List;

public class Talks extends Controller {
    //GET {controller}
    public static void index() {
        renderJSON(new SenchaResponse(true, Talk.findAll()));
    }

    //GET {controller}/id
    public static void show(final String id) {
        Logger.info("show");
    }

    //PUT {controller}
    public static void create(Model object) {
        Logger.info("create");
    }

    //POST {model}s/{id}
    public static void update() {
        Logger.info("update");
    }

    //DELETE {model}s/{id}
    public static void delete() {
        Logger.info("delete");
    }
    
    private static class SenchaResponse {
        private boolean success;
        private List items;

        private SenchaResponse(boolean success, List items) {
            this.success = success;
            this.items = items;
        }
    }
}

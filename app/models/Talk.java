package models;

import play.db.jpa.Model;

import javax.persistence.Entity;

@Entity
public class Talk extends Model {
    public String title;
    public String speaker;
}

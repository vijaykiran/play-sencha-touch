package models;

import play.db.jpa.Model;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Talk extends Model {
    public String title;
    public Date date;
    public String speaker;
}

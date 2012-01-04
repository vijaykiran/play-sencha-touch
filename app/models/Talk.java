package models;

import play.db.jpa.Model;

import java.util.Date;
import java.util.Set;

public class Talk extends Model {
    public Date title;
    public Date date;
    public Speaker speaker;
    public Set<String> tags;
}

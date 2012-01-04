package models;

import play.db.jpa.Model;

public class Speaker extends Model {

    public String name;
    public long votes;
    public long rating;
    public String email;

}

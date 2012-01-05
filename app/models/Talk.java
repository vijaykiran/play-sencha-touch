package models;

import com.google.gson.JsonParser;
import play.data.binding.Global;
import play.data.binding.TypeBinder;
import play.db.jpa.Model;

import javax.persistence.Entity;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;

@Entity
public class Talk extends Model {
    public String title;
    public Date date;
    public String speaker;
}

package utils;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import play.data.binding.Global;
import play.data.binding.TypeBinder;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;


@Global
public class JsonBinder implements TypeBinder<JsonObject> {

    @Override
    public Object bind(String name, Annotation[] annotations, String value, Class actualClass, Type genericType) throws Exception {
        return new JsonParser().parse(value);
    }
}
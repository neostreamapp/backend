package app.neostream.backend.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import spark.ResponseTransformer;

@Getter
public class JsonTransformer implements ResponseTransformer {
    private final Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();

    @Override
    public String render(Object o) {
        return gson.toJson(o);
    }
}

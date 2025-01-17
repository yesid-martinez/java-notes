package api.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.FieldNamingPolicy;

public class OMDbResponseHandler {
    public static OMDbTitle[] gsonHandler(String json) {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
       OMDbResponse response = gson.fromJson(json, OMDbResponse.class);
       return response.getSearch();
    }
}

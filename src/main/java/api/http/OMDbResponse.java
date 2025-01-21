package api.http;

import com.google.gson.annotations.SerializedName;

public class OMDbResponse {
    @SerializedName("Search")
    private OMDbTitle[] search;

    public OMDbTitle[] getSearch() {
        return this.search;
    }
}

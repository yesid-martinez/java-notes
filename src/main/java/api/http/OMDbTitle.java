package api.http;

import com.google.gson.annotations.SerializedName;

public record OMDbTitle(
        @SerializedName("Title") String title,
        @SerializedName("Year") String year
) {}


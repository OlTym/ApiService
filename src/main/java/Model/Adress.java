package Model;

import com.google.gson.annotations.SerializedName;

public class Adress {
    private String street;
    private String suit;
    private String city;
    private String zipcode;

    @SerializedName("geo")
    private Geo geo = new Geo();

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(" \"adress\": {").append("\n").
                append(" street: ").append(street).append(",\n").
                append(" suit: ").append(suit).append(",\n").
                append(" city: ").append(city).append(",\n").
                append(" zipcode: ").append(zipcode).append(",\n").
                append(geo);

        return builder.toString();

    }
}

package Model;

public class Geo {

    private double lat;
    private double lng;


    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(" \"geo\": {").append("\n").
                append(" lat: ").append(lat).append(",\n").
                append(" lng: ").append(lng).append(",\n").
                append("}");

        return builder.toString();

    }
}

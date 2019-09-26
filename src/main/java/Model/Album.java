package Model;

public class Album {
    private int userID;
    private int id;
    private String title;

    @Override
    public String toString() {

        final StringBuilder builder = new StringBuilder();
        builder.append("Album {").append("\n").
                append("userID: ").append(userID).append(",\n").
                append("id: ").append(id).append(",\n").
                append("title: ").append(title).append(",\n").
                append("}").append("\n");

        return builder.toString();

    }
}

package Model;

public class Post {

    private int userId;
    private int id;
    private String title;
    private String body;


    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Post{").append("\n").
                append("userID: ").append(userId).append(",\n").
                append("id: ").append(id).append(",\n").
                append("title: ").append(title).append(",\n").
                append("body: ").append(body).
                append("}").append("\n");

        return builder.toString();
    }
}

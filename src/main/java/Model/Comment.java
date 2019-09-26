package Model;

public class Comment {

    private int id;
    private int postId;
    private String name;
    private String email;
    private String body;

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Comment{").append("\n").
                append("postId: ").append(postId).append(",\n").
                append("id: ").append(id).append(",\n").
                append("name: ").append(name).append(",\n").
                append("email: ").append(email).append(",\n").
                append("body: ").append(body).
                append("}").append("\n");

        return builder.toString();
    }
}

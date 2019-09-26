package Model;

public class Todo {

    private int userID;
    private int id;
    private String title;
    private String completed;


    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Todo{").append("\n").
                append("userID: ").append(userID).append(",\n").
                append("id: ").append(id).append(",\n").
                append("title: ").append(title).append(",\n").
                append("completed: ").append(completed).
                append("}").append("\n");

        return builder.toString();

    }
}

package Model;

public class Photo {

    private int albumId;
    private int id;
    private String title;
    private String url;
    private String thumbnailUrl;


    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append("Photos{").append("\n").
                append("albumID: ").append(albumId).append(",\n").
                append("id: ").append(id).append(",\n").
                append("title: ").append(title).append(",\n").
                append("url: ").append(url).append(",\n").
                append("thumbnailUrl: ").append(thumbnailUrl).append("\n").
                append("}").append("\n");

        return builder.toString();

    }
}

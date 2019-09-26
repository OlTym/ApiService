package Model;

import com.google.gson.annotations.SerializedName;

public class User {

    private int id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;

    @SerializedName("address")
    private Adress adress = new Adress();
    @SerializedName("company")
    private Company company = new Company();


    @Override
    public String toString() {

        final StringBuilder builder = new StringBuilder();
        builder.append("User{").append("\n").
                append("id:").append(id).append(",\n").
                append("name:").append(name).append(",\n").
                append("username:").append(username).append(",\n").
                append("email:").append(email).append(",\n").
                append(adress).append("\n").append("}").append("\n").
                append("phone:").append(phone).append(",\n").
                append("website:").append(website).append(",\n").
                append(company).append("\n").
                append("}").append("\n");

        return builder.toString();

    }
}

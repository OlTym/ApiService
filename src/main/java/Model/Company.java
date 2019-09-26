package Model;

public class Company {

    private String name;
    private String catchPhrase;
    private String bs;

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(" \"company\": {").append("\n").
                append(" name: ").append(name).append(",\n").
                append(" catchPhrase: ").append(catchPhrase).append(",\n").
                append(" bs: ").append(bs).append(",\n").
                append("}");

        return builder.toString();

    }
}

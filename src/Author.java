public class Author {
    private String name;
    private String surName;

    public Author(String name, String sourName) {
        this.name = name;
        this.surName = sourName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
    @Override
    public String toString() {
        return "Author{" +
                "name=" + name + '\'' +
                "surName=" + surName +  '\'' +
                '}';
    }

}

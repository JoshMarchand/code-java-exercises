package movies;

public class Movie {
    private String name;
    private String category;

    public Movie(String name, String cata){
        this.name = name;
        this.category = cata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

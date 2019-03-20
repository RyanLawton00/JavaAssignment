package Film;

public class Film {
    private String filmname;
    private String duration;
    private String dateofRelease;
    private String director;
    private String cast;
    private String filmDescription;
    private double price;
    private int age;


    public Film(String filmname, String duration, String dateofRelease, String director, String cast, String filmDescription, double price, int age) {
        this.filmname = filmname;
        this.duration = duration;
        this.dateofRelease = dateofRelease;
        this.director = director;
        this.cast = cast;
        this.filmDescription = filmDescription;
        this.price = price;
        this.age = age;
    }

    public String getFilmname() {
        return filmname;
    }

    public void setFilmname(String filmname) {
        this.filmname = filmname;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getFilmDescription() {
        return filmDescription;
    }

    public void setFilmDescription(String filmDescription) {
        this.filmDescription = filmDescription;
    }

    public String getDateofRelease() {
        return dateofRelease;
    }

    public void setDateofRelease(String dateofRelease) {
        this.dateofRelease = dateofRelease;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}

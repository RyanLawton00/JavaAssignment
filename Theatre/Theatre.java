package Theatre;

import Film.Film;
import javafx.collections.ObservableList;


public class Theatre {
    private String theatreName;
    private String theatreLocation;
    private int seats;
    private Film film;

    public Theatre() {
    }

    public Theatre(String theatreName, String theatreLocation, int seats, Film film) {
        this.theatreName = theatreName;
        this.theatreLocation = theatreLocation;
        this.seats = seats;
        this.film = film;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getTheatreLocation() {
        return theatreLocation;
    }

    public void setTheatreLocation(String theatreLocation) {
        this.theatreLocation = theatreLocation;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    public void minusSeats(int seats){
        this.seats =- seats;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @Override
    public String toString() {
        return theatreName + "    Theatre Location:    " + theatreLocation + "    Seats:    " + seats + "    Film Name:    " + film.getFilmname() + "    Price:  £" + film.getPrice() + "    Age:  " + film.getAge();
    }
}

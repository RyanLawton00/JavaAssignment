package Theatre;;

import Film.Film;
import Film.FilmList;
import javafx.collections.ObservableList;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TheatreList {



    private static ArrayList<Theatre> theatre = new ArrayList();
    private static Theatre selectedTheatre;



    public static void initializeTheatres(){

        theatre.add(new Theatre("Theatre A ", "Location A ", 90, FilmList.getFilms().get(0)));
        theatre.add(new Theatre("Theatre B ", "Location B ", 100,FilmList.getFilms().get(1)));
        theatre.add(new Theatre("Theatre C ", "Location C ", 120,FilmList.getFilms().get(2)));
        theatre.add(new Theatre("Theatre D ", "Location D ", 75,FilmList.getFilms().get(3)));
        theatre.add(new Theatre("Theatre E ", "Location E ", 50,FilmList.getFilms().get(4)));
        theatre.add(new Theatre("Theatre F ", "Location F ", 115,FilmList.getFilms().get(5)));
        theatre.add(new Theatre("Theatre G ", "Location G ", 68,FilmList.getFilms().get(6)));
        theatre.add(new Theatre("Theatre H ", "Location H ", 96,FilmList.getFilms().get(7)));
        theatre.add(new Theatre("Theatre I ", "Location I ", 92,FilmList.getFilms().get(8)));
        theatre.add(new Theatre("Theatre J ", "Location J ", 92,FilmList.getFilms().get(9)));



        /*
        theatre.add(new Theatre("Theatre A", 50, 12,2.50,"Titanic", FilmList.getFilms().get(0)));
        theatre.add(new Theatre("Theatre B",120,12,5.00,"Jumanji", FilmList.getFilms().get(1)));
        theatre.add(new Theatre("Theatre C",100,18,2.50,"The Godfather", FilmList.getFilms().get(2)));
        theatre.add(new Theatre("Theatre D",80, 15,2.50,"American Pie", FilmList.getFilms().get(3)));
        theatre.add(new Theatre("Theatre E",100, 12, 5.00, "Captain Marvel", FilmList.getFilms().get(4)));
        theatre.add(new Theatre("Theatre F",75,12,5.00,"Black Panther", FilmList.getFilms().get(5)));
        theatre.add(new Theatre("Theatre G",80, 12,5.00,"Fantastic Beasts", FilmList.getFilms().get(6)));
        theatre.add(new Theatre("Theatre H",100,12,5.00,"Creed II", FilmList.getFilms().get(7)));
        theatre.add(new Theatre("Theatre I",150,12,2.50,"Ready Player One", FilmList.getFilms().get(8)));
        theatre.add(new Theatre("Theatre J",125,15,2.50, "The Shawshank Redemption", FilmList.getFilms().get(9)));
        */

    }

    public static ArrayList<Theatre> getTheatres() {
        return theatre;
    }

    public static void addSelectedTheatre(Theatre theatre){
        selectedTheatre = theatre;
    }

    public static Theatre getSelectedTheatre() {
        return selectedTheatre;
    }
}

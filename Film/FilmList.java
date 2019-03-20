package Film;

import Theatre.TheatreList;

import java.util.ArrayList;

public class FilmList {
    private static ArrayList<Film> films = new ArrayList<Film>();
    public static void initializeFilms(){

         films.add(new Film("Titanic          ", "2hrs 10", "19/12/1997","James Cameron","Leonardo De-Caprio, Kate Winslet ","Big Boat Crashes in big ice cube.", 2.50,12));
         films.add(new Film("Jumanji          ","1hr 50", "20/12/2017", "Jeff Stevens", "The Rock, Kevin Hart, Jack Black", "Group of Students get stuck in a game.",5.00, 12 ));
         films.add(new Film("The Godfather    ","2hr 00","24/03/1972","Francis FC","Marlon Brando, Al Pacino", "One of the best films ever", 2.50,18 ));
         films.add(new Film("American Pie     ", "1hr 30", "09/07/1999", "Chris Weitz","Jason briggs, Chris Klein","Group of mates try bake a pie", 2.50, 15));
         films.add(new Film("Captain Marvel   ","2hr 50","08/03/2019","Anna Boden","Brie Larson, Samuel L. Jackson","What difference will she make against thanos?", 5.00, 12));
         films.add(new Film("Black Panther    ","1hr 40","16/02/2018","Ryan Coogler","Chadwick Boseman, Michael B Jordan", "He's dust atm", 5.00, 12));
         films.add(new Film("Fantastic Beasts ","2hr 15","18/11/2016","David Yates","Eddie Redmayne","Harry Potter in America", 5.00, 12));
         films.add(new Film("Creed II         ","1hr 55","30/11/2018","Steven Caple","Sylvestor Stallone, Michael B Jordan","Apollo creeds son", 5.00, 12));
         films.add(new Film("Ready Player One ","2hr 05","30/03/2018","Steven Spielberg","Tye Sheridon","Virtual Reality", 2.50, 12));
         films.add(new Film("Shawkshank Redem.","2hr 02","14/08/1994","Frank Darabont","Tim Robbins","Highly rated", 2.50, 15));

     }

    public static ArrayList<Film> getFilms() {
        return films;
    }


}

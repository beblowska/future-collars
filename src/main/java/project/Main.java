package project;

public class Main {

    public static void main(String[] args) {

        Film film = new Film("Minions","Kyle Balda, Pierre Coffin", 90, 2015);

        System.out.println("Title: " + film.getTitle());
        System.out.println("Director: " + film.getDirector());
        System.out.println("Film time in minutes: " + film.getFilmTimeInMinutes());
        System.out.println("Production year: " + film.getProductionYear());
    }
}

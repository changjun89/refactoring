package exam01;

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int dayRented) {
        this._movie = movie;
        this._daysRented = dayRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDaysRented() {
        return _daysRented;
    }
}

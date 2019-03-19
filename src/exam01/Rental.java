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

    public double getCharge() {
        return _movie.getCharge(_daysRented);
    }
    //최신물을 이틀 이상 대여하면 보너스 포인트 지급
    public int getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_daysRented);
    }



}

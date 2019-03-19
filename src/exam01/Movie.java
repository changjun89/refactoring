package exam01;

public class Movie {
        public static final int CHILDRENS = 2;
        public static final int REGULAR = 0;
        public static final int NEW_RELEASE = 1;
        private String _title;
        private int _priceCode;

        public Movie(String _title, int _priceCode) {
            this._title = _title;
            this._priceCode = _priceCode;
        }

        public String getTitle() {
            return _title;
        }

        public int getPriceCode() {
            return _priceCode;
        }

        public void setPriceCode(int _priceCode) {
            this._priceCode = _priceCode;
        }


    public double getCharge(int daysRented) {
        double result = 0;

        switch (getPriceCode()) {
            case Movie.REGULAR:
                result += 2;
                if (daysRented > 2)
                    result += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                result += daysRented;
                break;
            case Movie.CHILDRENS:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }

    //최신물을 이틀 이상 대여하면 보너스 포인트 지급
    public int getFrequentRenterPoints(int daysRented) {
        if (getPriceCode() == Movie.NEW_RELEASE && daysRented > 1) {
            return 2;
        }
        return 1;
    }
}

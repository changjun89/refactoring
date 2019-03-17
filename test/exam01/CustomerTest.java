package exam01;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    @Before
    public void setup () {
        customer = new Customer("이창준");
    }

    @Test
    public void testStatement() {
        Rental rental1 = new Rental(new Movie("어린이무비",Movie.CHILDRENS),1);
        Rental rental2 = new Rental(new Movie("최신무비",Movie.NEW_RELEASE),2);
        Rental rental3 = new Rental(new Movie("보통무비",Movie.REGULAR),3);
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);

        assertEquals("이창준고객님의 대여 기록\n" +
                "\t어린이무비\t1.5\n" +
                "\t최신무비\t2.0\n" +
                "\t보통무비\t3.5\n" +
                "누적 대여료: 7.0\n" +
                "적립 포인트: 4\n",customer.statement());
    }


}

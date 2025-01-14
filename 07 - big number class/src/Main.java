/**
 - jika kita ada kebutuhan untuk menggunakan angka yang besar sehingga melebihi kapasitas Long dan double, di java sudah disediakan
 class untuk handle data besar tersebut
 - BigInteger adalah class untuk handle tipe data Integer, dan
 - BigDecimal adalah class untuk handle tipe data floating point
 */

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 method di class ini:

 - add          : +
 - subtract     : -
 - multiply     : *
 - devide       : /
 - mod          : %
 dll
 */


public class Main {
    public static void main(String[] args) {

        BigInteger a = new BigInteger("9223372036854775808");
        BigInteger b = new BigInteger("9223372036854775809");

        BigInteger oomagad = a.multiply(b);
        System.out.println(oomagad);

        double z = 1.7976931348623157E308;

        BigDecimal zBig = new BigDecimal("1.7976931348623157E309");
        BigDecimal yBig = new BigDecimal("1.7976931348623157E309");
        System.out.println(zBig.multiply(yBig));
    }
}
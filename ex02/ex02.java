import currency.*;
import distance.*;
import time.*;
import java.util.Scanner;

public class Convertor {

    public static void main(String[] args) {

        int code, currency_code, distance_code, time_code;

        Scanner sc = new Scanner(System.in);

        CurrencyConvertor currency = new CurrencyConvertor();
        DistanceConvertor distance = new DistanceConvertor();
        TimeConvertor time = new TimeConvertor();

        System.out.println("Enter the code:");
        System.out.println("1: Currency");
        System.out.println("2: Distance");
        System.out.println("3: Time");

        code = sc.nextInt();

        // Currency
        if (code == 1) {

            System.out.println("Enter the Currency code:");
            System.out.println("1: Euro");
            System.out.println("2: Dollar");
            System.out.println("3: Yen");

            currency_code = sc.nextInt();

            if (currency_code == 1) {

                currency.convertInrToEuro();
                currency.convertEuroToInr();

            } else if (currency_code == 2) {

                currency.convertInrToDollar();
                currency.convertDollarToInr();

            } else if (currency_code == 3) {

                currency.convertInrToYen();
                currency.convertYenToInr();

            } else {

                System.out.println("Invalid Currency Code");
            }
        }

        // Distance
        else if (code == 2) {

            System.out.println("Enter the Distance code:");
            System.out.println("1: Meter");
            System.out.println("2: Miles");

            distance_code = sc.nextInt();

            if (distance_code == 1) {

                distance.convertMeterToKm();
                distance.convertKmToMeter();

            } else if (distance_code == 2) {

                distance.convertMilesToKm();
                distance.convertKmToMiles();

            } else {

                System.out.println("Invalid Distance Code");
            }
        }

        // Time
        else if (code == 3) {

            System.out.println("Enter the Time code:");
            System.out.println("1: Minutes");
            System.out.println("2: Seconds");

            time_code = sc.nextInt();

            if (time_code == 1) {

                time.convertHourToMinute();
                time.convertMinuteToHour();

            } else if (time_code == 2) {

                time.convertHourToSeconds();
                time.convertSecondsToHour();

            } else {

                System.out.println("Invalid Time Code");
            }
        }

        else {

            System.out.println("Invalid Code");
        }

        sc.close();
    }
}
package distance;
import java.util.*;
import java.text.DecimalFormat;
public class DistanceConvertor
{
	double meter,km,miles;
	Scanner sc = new Scanner(System.in);
	DecimalFormat f = new DecimalFormat("##.###");
	public void convertMeterToKm()
	{
		System.out.println("Enter the meter");
		meter = sc.nextFloat();
		km = meter*0.001;
		System.out.println("Kilometer : "+f.format(km));
	}
	public void convertKmToMeter() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter distance in KM: ");
    double km = sc.nextDouble();
    double meter = km * 1000;
    System.out.println("Distance in Meter: " + meter);
}

	public void convertMilesToKm()
	{
		System.out.println("Enter the miles");
		miles = sc.nextFloat();
		km = miles*1.6093;
		System.out.println("Kilometer : "+f.format(km));
	}
	public void convertKmToMiles() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter distance in KM: ");
    double km = sc.nextDouble();
    double miles = km * 0.621371;
    System.out.println("Distance in Miles: " + miles);
}
}


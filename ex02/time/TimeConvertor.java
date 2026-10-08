package time;
import java.util.*;
import java.text.DecimalFormat;
public class TimeConvertor
{
	double hour,minute,second;
	Scanner sc = new Scanner(System.in);
	DecimalFormat f = new DecimalFormat("##.###");
	public void convertHourToMinute()
	{
		System.out.println("Enter the Hour");
		hour = sc.nextFloat();
		minute = hour*60;
		System.out.println("Minutes : "+f.format(minute));
	}
	public void convertMinuteToHour()
	{
		System.out.println("Enter the Minute");
		minute = sc.nextFloat();
		hour = minute/60;
		System.out.println("Hour : "+f.format(hour));
	}
	public void convertHourToSeconds() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter time in Hours: ");
    double hour = sc.nextDouble();

    double seconds = hour * 3600;

    System.out.println("Time in Seconds: " + seconds);
}
	public void convertSecondsToHour()
	{
		System.out.println("Enter the Seconds");
		second = sc.nextFloat();
		hour = second*3600;
		System.out.println("Hours : "+f.format(hour));
	}
}

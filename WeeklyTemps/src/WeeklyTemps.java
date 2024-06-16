import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemps {

	public static void main(String[] args) {
		
		ArrayList<String> days = new ArrayList<String>();
		days.add("Monday");
		days.add("Tuesday");
		days.add("Wednesday");
		days.add("Thursday");
		days.add("Friday");
		days.add("Saturday");
		days.add("Sunday");
		
		ArrayList<Integer> avg_temps = new ArrayList<Integer>();
		avg_temps.add(85);
		avg_temps.add(90);
		avg_temps.add(84);
		avg_temps.add(87);
		avg_temps.add(89);
		avg_temps.add(91);
		avg_temps.add(92);
		
		String my_day;
		int my_dayIndex;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("WEATHER FORECAST");
		System.out.println("Enter a day for temperature or 'week' for week forecast:");
		my_day =  scan.nextLine();
		
		if(my_day.contains("week")) {
			int sumTemps = 0;
			for(int i = 0; i < avg_temps.size(); i++) {
				sumTemps += avg_temps.get(i);
				System.out.println(days.get(i) + ": " + avg_temps.get(i));
			}
			System.out.println("Weekly Avg Temp: " + sumTemps / avg_temps.size());
			
		}
		else if(days.contains(my_day)) {
			my_dayIndex = days.indexOf(my_day);
			System.out.println(my_day + ": " + avg_temps.get(my_dayIndex));
		}
		else {
			System.out.println("Invalid entry.");
		}
	}

}

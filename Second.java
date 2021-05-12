//My second java prg
// To convert minutes into years and days using methods.
public class Main {
	int mins,hours,days,years,Remaining_Days;
	void calculate(int minutes)
	{
		mins=minutes;
		hours = mins/60;
		days = hours/24;
		years = days/365;

		Remaining_Days = days % 365;
	}
	void display()
	{
		System.out.println(mins+" minutes is approximately "+years+" years "+Remaining_Days+" days");
	}

	public static void main(String[] args) {
		Main obj=new Main();
		int minutes=3456789;
		obj.calculate(minutes);
		obj.display();
		}
}

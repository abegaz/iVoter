import java.sql.Date;
import java.time.LocalDateTime;
public class PersonAge {
	private int year;
	private int month;
	private int day;
	private final int  THIS_YEAR=2016;
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setAge(int ageIn)
	{
		year=ageIn;
	}
	public int getAge()
	{
		return year;
	}
public int ApproximateAge(int year)
{
	int approximateAge;
	approximateAge=THIS_YEAR-year;
return approximateAge;
}
public int computeAge(int dayIn, int monthIn, int yearIn)
{
	int age, now, day, year, month;
	LocalDateTime currentDate = LocalDateTime.now();
	day=currentDate.getDayOfMonth();
	month=currentDate.getMonthValue();
	year=currentDate.getYear();
	if(monthIn<month)
		age=year-yearIn;
	else if(monthIn==month)
		if(dayIn>=day)
			age=year-yearIn-1;
		else age=year-(yearIn);
	else
		age=year-(yearIn-1);
	return age;
}
}


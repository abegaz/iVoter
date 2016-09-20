import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;
public class AgeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age;
		String scale;
		double temperatureVal, temInCelsius;
		PersonAge myAge=new PersonAge();// we created an instance
		Temperature celsius=new Temperature();
		TaretHR targetHR=new TaretHR();
		Scanner scannerIn=new Scanner(System.in);
		System.out.println("You were born in (year)?");
		age=scannerIn.nextInt();
		System.out.println("You were born? day, month, year");
		//scannerIn.nextInt();
		System.out.println("Your age is "+myAge.computeAge(scannerIn.nextInt(), scannerIn.nextInt(), scannerIn.nextInt()));
		targetHR.setAge(age);
		myAge.setAge(age);
		System.out.println("Your approximate age is"+myAge.ApproximateAge(age));
		targetHR.computeTargetHR();
		//System.out.println("Enter  the temparture value");
		//temperatureVal=scannerIn.nextDouble();
		//myAge.setAge(scannerIn.nextInt());
		//temInCelsius=celsius.convertIntoCelsius(temperatureVal, scale);
		//age=myAge.ApproximateAge(myAge.getAge());
		//System.out.println("The celsius temprature for temprature value + temperatureVal in " + scale + " is"+ temInCelsius);

	}

}

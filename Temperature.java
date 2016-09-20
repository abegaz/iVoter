
public class Temperature {
private String scale;
private double temperatureValue;
public void setScale(String scaleIn)
{
	scale=scaleIn;
}
public String getScale()
{
	return scale;
}
public void setTemperatureValue(double tempIn)
{
	temperatureValue=tempIn;
}
public double getTemprature()
{
	return temperatureValue;
}
public double convertIntoCelsius(double temperatureIn, String scale)
{
	double celsius=0.0;
	if(scale.equals("F"))
		celsius=9/5*(temperatureIn-32);
	else if (scale.equals("K"))
		celsius=temperatureIn-273.15;
	else 
		System.out.println("Wrong Conversion request!");
	return celsius;
}
}

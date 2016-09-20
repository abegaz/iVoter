
public class TaretHR {
	private int age;
	private final int HEART_BEAT=220;
	public void setAge(int ageIn)
	{
		age=ageIn;
	}
	public int getAge() {
		return age;
	}
	public void computeTargetHR(){
		double maxHR;
		maxHR=HEART_BEAT-age;
		System.out.println("Your target heart rate is between " + maxHR*0.5+ "and "+ maxHR*0.85);
	}

}

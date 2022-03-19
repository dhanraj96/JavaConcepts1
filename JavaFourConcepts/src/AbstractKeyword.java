
abstract class Pune_Rules
{
	abstract void SpeedLimit();
	abstract void rashDriving();
	abstract void rule3();
}
	class Seltos extends Pune_Rules
	{
		void rule3()
		{
			System.out.println("Rule 3 Integrated");
		}
		void rashDriving()
		{
			System.out.println("Alert Voice");
		}
		void SpeedLimit()
		{
			System.out.println("Speed Limit is 80");
			
		}
		void Speed()
		{
			System.out.println("Speed is 180");
		}
	}

public class AbstractKeyword {

	public static void main(String[] args) {
		Seltos object = new Seltos();
		object.rule3();
		object.rashDriving();
		object.SpeedLimit();
		

	}

}

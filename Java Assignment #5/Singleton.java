package sowmya.assignment5.singleton;

public class Singleton {

		String variable1;
		public static Singleton print1(String variable1)
		{
			//this.variable1 = variable1;  we cannot use this static reference
			Singleton object = new Singleton();
			return object;
		}

		public void print2()
		{
			System.out.println(variable1);
		}
	}




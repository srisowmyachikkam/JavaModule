package sowmya.assignment5.main;

import sowmya.assignment5.data.Data;
import sowmya.assignment5.singleton.Singleton;

public class Main {
	 public static void main(String args[]){
	        Data object1 = new Data();
	        object1.display1();
	        object1.display2();
	        
	        Singleton object2 = new Singleton();
	        Singleton.print1("It is a Static method");
	        object2.print2();

	    }

}

package oops_module;
import java.util.Arrays;
public class Constrcutor 
{
	 private String str;
	 public Constrcutor(String str)
	 {
	        System.out.println(str);
	 }

	 public static void main(String[] args) 
	 {
		     Constrcutor array[]=new Constrcutor[5];
		        for(int i=0;i<5;i++)
		        {
		            array[i]=new Constrcutor("java_assignment");
		        }
	 }

}

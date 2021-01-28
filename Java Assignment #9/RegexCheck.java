package oops_module;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheck {

		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String : ");
			String inputString = sc.nextLine();
			String regex = "^[A-Z].*[.]$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher=pattern.matcher(inputString);
	
			
			if(matcher.matches())
				System.out.println("Sentence starts with Capital letter and ends with '.'");
			else
				System.out.println("Sentence does not start with Capital letter or doesn't ends with '.'");	

		}

	}


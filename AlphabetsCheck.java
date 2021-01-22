import java.util.Scanner;
public class AlphabetsCheck
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String inputString = sc.nextLine();
        inputString = inputString.toLowerCase();
        int count = 0;
        int emptyString[] = new int[26];

        for (int i = 0; i < inputString.length(); i++)
        {
            char character = inputString.charAt(i);
            int val = (int) character;
            if (val > 96 && val < 123)
                emptyString[val - 97] = 1;
        }

        for (int i = 0; i < 26; i++)
        {
            if (emptyString[i] == 1)
                count++;
            else
                break;
        }

        if (count == 26)
            System.out.println("The input string contains all the alphabets");
        else
            System.out.println("The input string doesn't contain all the alphabets ");
    }
}


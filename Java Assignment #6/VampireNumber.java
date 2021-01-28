package oops_module;
import java.util.ArrayList;
import java.util.Arrays;

public class VampireNumber 
  {
	    public static boolean isVampirePair(int a,int b,int num)
	    {
	        String val1=String.valueOf(a);
	        String val2=String.valueOf(b);
	        String vampire=String.valueOf(num);
	        if((val1.length()!=val2.length()) || (val1.endsWith("0") && val2.endsWith("0")))
	            return false;
	        String vals=val1+val2;
	        char tempArray[] = vals.toCharArray();
	        Arrays.sort(tempArray);
	        char vamArray[]=vampire.toCharArray();
	        Arrays.sort(vamArray);
	        vals=new String(tempArray);
	        vampire=new String(vamArray);
	        if(vals.equals(vampire))
	            return true;
	        return false;
	    }
	    
	    public static boolean isDigitCountOdd(int num){
	    String s=String.valueOf(num);
	    System.out.println(s);
	    if((s.length()&1)==1)
	       return true;
	    return false;
	    }
	    
	    public static boolean isVampire(int num){
	        int a,b;
	        if(isDigitCountOdd(num))
	            return false;
	        for(int k=1;k*k<=num;k++){
	         if(num%k==0) {
	             a = k;
	             b = num / a;
	             if(isVampirePair(a, b,num))
	                 return true;
	         }
	        }
	        return false;
	    }
	    
	    public static void main(String[] args) 
	    {
	    	int count=0;
	        for(int i=1260;count<100;i++)
	        {
	            if(isVampire(i)) 
	            {
	                System.out.println(i);
	                count++;
	            }
	      
	        }
	    }
  }


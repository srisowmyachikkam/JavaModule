package oops_module;

public class ErrorHandling {
	public void test() 
	{
		
		int array[] = new int[10]; 
		String sampleString = null;
		try 
		{
			//System.out.println(sampleString.charAt(0)); it results in NullPointerException
			System.out.println(array[13]); // It results in ArrayIndexOutOfBoundsException
			
		} 
		catch (NullPointerException | ArrayIndexOutOfBoundsException | ArrayStoreException e) {
			
			System.out.println("Exception caused is : " + e);
			}
        
		finally 
		{
			System.out.println("This is Final Block Statement");
		}
	}

}

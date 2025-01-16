import java.util.Scanner;

public class NullExceptionHandle {

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//take a string 
		String text = null;
		
		//Perfrom append operation
		try{
				String str2 = text.concat("abs"); //Causing the NullPointerException
				System.out.print("String after operation is: "+str2);
		}
		catch(NullPointerException e){
			System.out.print("Cannot concat with null \n"+e);
		}
		
		
		
	
		input.close();
	}
}
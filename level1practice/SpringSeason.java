import java.util.Scanner;

public class SpringSeason {

	// Method for the checking entered date is springSeason or not
	public boolean isSpringSeason(int month, int day){
		
		//Spring season is March(3) 20 to June(6) 20
		int fromSpringMonth = 3;
		int fromSpringDay = 20;
		int toSpringMonth = 6;
		int toSpringDay = 20;
		
		//Check 
		if(month == fromSpringMonth && day >= fromSpringDay) //starting month check
			return true;
		else if(month == toSpringMonth && day <= toSpringDay) //check for last month
			return true;
		else if(month > fromSpringMonth && month < toSpringMonth) //check for any month in between
			return true;
		else
			return false;
		
		
	}

	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		//Prompt the user for input
		System.out.print("Enter month (example january is 1 and December is 12):");
		int month = input.nextInt();
		
		System.out.println("Enter date of the month: ");
		int day = input.nextInt();
		
		//Create Object 
		SpringSeason obj = new SpringSeason();
		
		//call the method
		boolean isSpringSeason = obj.isSpringSeason(month, day);
		
		//Check
		if(isSpringSeason == true){
			System.out.print("Spring Season");
		}
		else System.out.print("Not a Spring Season");
		
		input.close();
	}
}
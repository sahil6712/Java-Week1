import java.util.Scanner;

public class FriendsData {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		//Prompt user to get the age
		System.out.println("Enter age of Amar");
		int amarAge = input.nextInt();
		
		System.out.println("Enter age of Akbar");
		int akbarAge = input.nextInt();
		
		System.out.println("Enter age of Anthony");
		int anthonyAge = input.nextInt();
		
		//prompt user to get the height
		System.out.println("Enter height of friend1");
		int amarHeight = input.nextInt();
		
		System.out.println("Enter height of friend1");
		int akbarHeight = input.nextInt();
		
		System.out.println("Enter height of friend1");
		int anthonyHeight = input.nextInt();
		
		//Findin youngest of three
		if(amarAge <= akbarAge){
			if(amarAge <= anthonyAge)
				System.out.println("amar is the Youngest");
			else
				System.out.println("anthony is the Youngest");
		}
		else{
			if(akbarAge <= anthonyAge)
				System.out.println("akbar is the Youngest");
			else
				System.out.println("anthony is the Youngest");
		}
		
		//Findin tallest of three
		if(amarHeight >= akbarHeight){
			if(amarHeight >= anthonyHeight)
				System.out.println("amar is the tallest");
			else
				System.out.println("anthony is the tallest");
		}
		else{
			if(akbarHeight >= anthonyHeight)
				System.out.println("akbar is the tallest");
			else
				System.out.println("anthony is the tallest");
		}
		
		input.close();

	}
}
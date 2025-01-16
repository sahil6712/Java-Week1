import java.util.Scanner;

public class SplitText2 {
	
	//Method to split text
	public static String[][] splitText(String str) { 
		
		int countWords = str.split("\\s").length; //to get the number of words
		//Store the result
		String[][] result = new String[countWords][2]; 
		int indexRow = 0;        //index to get the rows
		
		for(int i=0; i<str.length(); i++) {
			int count = 0;
			StringBuilder sb = new StringBuilder();
			while(i<str.length() && str.charAt(i) != ' '){      //get the word
				sb.append(str.charAt(i));                       //adding character to the sb
				i++;
				count++;                                        //increment length of word
			}
			if(count > 0){                                      // when word length>0
				result[indexRow][0] = sb.toString();
				result[indexRow][1] = Integer.toString(count);
				indexRow++;
			}
		}
		return result;
	}
	
	public static void main(String args[]){
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the text: ");
		String text = input.nextLine();
		
		//call method to get the words and their length
		String[][] words = splitText(text);
		System.out.print("the output is \n");
		for(int i=0; i<words.length; i++){
			System.out.println(words[i][0]+" -> "+Integer.parseInt(words[i][1]));
		}
		
		input.close();
	}
}


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegex {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String name_match = "[A-Z]{1}[a-zA-Z]{2,}";			//String pattern to be detected

		String name;
		
		//Checking for matches
		while(true) {
			
			//Entering Username
			System.out.print("Please enter your User Name: ");
			name = sc.nextLine();
			
			boolean check=name.matches(name_match);							//Condition check
			if(check) {
				break;
			}else{
				System.out.println("Incorrect format. Please try again.");
				System.out.println();
			}
		}
		System.out.println("Welcome "+name);
		System.out.println("Program End.");
	}
}

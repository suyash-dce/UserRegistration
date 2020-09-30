import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegex {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String fname_match = "[A-Z]{1}[a-zA-Z]{2,}";			//String pattern to be detected
		String lname_match = fname_match;
		String email_match = "^(abc)+[0-9a-z_+-.]*@bl\\.co\\.[a-z]{2}$";
		
		String firstname;
		String lastname;
		String email;
		
		//Checking for matches
		
		while(true) {
			//Entering firstname
			System.out.print("Please enter your First Name: ");
			firstname = sc.nextLine();
			
			boolean check=firstname.matches(fname_match);							//Condition check
			if(check) {
				break;
			}else{
				System.out.println("Incorrect format. Please try again.");
				System.out.println();
			}
		}
		
		while(true) {
			//Entering lastname
			System.out.print("Please enter your Last Name: ");
			lastname = sc.nextLine();
			
			boolean check=lastname.matches(lname_match);							//Condition check
			if(check) {
				break;
			}else{
				System.out.println("Incorrect format. Please try again.");
				System.out.println();
			}
		}
		
		while(true) {
			//Entering email
			System.out.print("Please enter your Email ID: ");
			email = sc.nextLine();
			
			boolean check=email.matches(email_match);							//Condition check
			if(check) {
				break;
			}else{
				System.out.println("Incorrect format. Please try again.");
				System.out.println();
			}
		}
		System.out.println("Welcome "+firstname+" "+lastname);
		System.out.println("You Email ID is "+email);
		System.out.println("Program End.");
	}
}

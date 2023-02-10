import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class UserRegistrationMain
{
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String arg[])
	{
		ValidationDuringUserEntry validationUserEntry = new ValidationDuringUserEntry();
		System.out.println("Enetr your first name");
		String firstName = scan.next();
		
		validationUserEntry.firstNameValidation(firstName);
	
	}
}
class ValidationDuringUserEntry
{
	
	public void firstNameValidation(String firstName)
	{
		if(Pattern.matches("^[A-Z]{1}[a-z]{2}$" , firstName) == true)
		{
			System.out.println("Valid First Name");
		}
		else
		{
			System.out.println("Invalid First Name");
		}
	}
	
	
}

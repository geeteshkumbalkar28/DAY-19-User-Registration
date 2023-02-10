import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class UserRegistrationMain
{
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String arg[])
	{
		ValidationDuringUserEntry validationUserEntry = new ValidationDuringUserEntry();
		System.out.println("Enetr your email");
		String email = scan.next();
		
		validationUserEntry.emailValidation(email);
	
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
	public void lastNameValidation(String lastName)
	{
		if(Pattern.matches("^[A-Z]{1}[a-z]{2}$" , lastName) == true)
		{
			System.out.println("Valid Last Name");
		}
		else
		{
			System.out.println("Invalid Last Name");
		}
	}
	public void emailValidation(String email)
	{
	if(Pattern.matches("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9]+)*$" , email) == true)
		{
			System.out.println("Valid email");
		}
		else
		{
			System.out.println("Invalid email");
		}
	}
}

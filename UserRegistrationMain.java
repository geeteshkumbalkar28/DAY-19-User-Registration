import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;


public class UserRegistrationMain
{
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String arg[])
	{
		ValidationDuringUserEntry validationUserEntry = new ValidationDuringUserEntry();
		System.out.println("Enetr your Password");
		String password = scan.next();
		/*byte arr[]=poneNumber.getBytes();
		for(int i=0; i<arr.length;i++)
		{
			System.out.println( arr[i]);
		}*/
		validationUserEntry.passwordValidation(password);
	
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
	//abc.xyz@bl.co.in   ///abc@bl.co
	public void emailValidation(String email)
	{
	if(Pattern.matches("^[a-z]+(.[a-z]+)?@bl.co(.in)?$" , email) == true)
		{
			System.out.println("Valid email");
		}
		else
		{
			System.out.println("Invalid email");
		}
	}
	public void phoneValidation(String phone)
	{
		if(Pattern.matches("^(91\\s)?[0-9]{10}" ,phone) == true)
		{
			System.out.println("Valid phone number");
		}
		else
		{
			System.out.println("Invalid phone number");
		}
	}
	
	public void passwordValidation(String password)
	{
		if(Pattern.matches("^[A-Z][a-zA-Z]{7,}" ,password) == true)
		{
			System.out.println("Valid Password number");
		}
		else
		{
			System.out.println("Invalid Password number");
		}
	}

}

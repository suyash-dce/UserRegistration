import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationUC10 {

	//Run Test for FirstName - 1 Happy and 1 Sad
	@Test
	public void FirstNameCorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validateFName("Suyash");
		Assert.assertTrue(result);
	}

	@Test
	public void FirstNameIncorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validateFName("Ch");
		Assert.assertFalse(result);
	}

	//Run Test for LastName - 1 Happy and 1 Sad
	@Test
	public void LastNameCorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validateLName("Jain");
		Assert.assertTrue(result);
	}

	@Test
	public void LastNameIncorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validateLName("Jn");
		Assert.assertFalse(result);
	}

	//Run Test for Email - 1 Happy and 1 Sad
	@Test
	public void EmailCorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validateEmail("suyash.jain@gmai.com");
		Assert.assertTrue(result);
	}

	@Test
	public void EmailIncorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validateEmail("mail@.com");
		Assert.assertFalse(result);
	}

	//Run Test for Phone - 1 Happy and 1 Sad
	@Test
	public void PhoneCorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validatePhone("91 9810224035");
		Assert.assertTrue(result);
	}

	@Test
	public void PhoneIncorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validatePhone("54681");
		Assert.assertFalse(result);
	}
	
	//Run Test for Password - 1 Happy and 1 Sad
	@Test
	public void PasswordCorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validatePassword("asdfghjkl");
		Assert.assertTrue(result);
	}

	@Test
	public void PasswordIncorrect() {
		UserRegValidate checker=new UserRegValidate();
		boolean result=checker.validatePassword("Suyash1234");
		Assert.assertFalse(result);
	}
}

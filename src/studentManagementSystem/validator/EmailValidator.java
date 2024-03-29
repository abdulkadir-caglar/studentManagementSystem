package studentManagementSystem.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	private static final String EMAIL_PATTERN =
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" +
		    "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private static final Pattern emailPattern = Pattern.compile(EMAIL_PATTERN);
	
	public static boolean isValidEmail(String email) {
		Matcher matcher = emailPattern.matcher(email);
		return matcher.matches();
	}
}

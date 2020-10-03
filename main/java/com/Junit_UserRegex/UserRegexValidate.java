import java.util.regex.Pattern;

import com.user_reg_validate.UserDetailInvalid.ExceptionType;

public class UserRegexValidate {
    
    //Defining pattern as global variables
    private static final String FNAME_MATCH = "[A-Z]{1}[a-zA-Z]{2,}";            //String pattern to be detected
    private static final String LNAME_MATCH = FNAME_MATCH;
    private static final String EMAIL_MATCH = "^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*@([0-9a-zA-Z][-]?)+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    private static final String PHONE_MATCH = "[0-9]{1,}\\s[1-9]{1}[0-9]{9}";
    private static final String PASS_MATCH = "((?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])).{8,}";
    
    //Function to check validity of First Name
    public boolean validateFName(String fname) throws UserDetailInvalid {
        Pattern pattern=Pattern.compile(FNAME_MATCH);
        boolean check=pattern.matcher(fname).matches();
        if(check) {
            return check;
        }else {
            throw new UserDetailInvalid("First Name Invalid Exception",
                    ExceptionType.INVALID_FIRSTNAME);
        }
    }
    
    //Function to check validity of Last Name
        public boolean validateLName(String lname) throws UserDetailInvalid {
            Pattern pattern=Pattern.compile(LNAME_MATCH);
            boolean check=pattern.matcher(lname).matches();
            if(check) {
                return check;
            }else {
                throw new UserDetailInvalid("Last Name Invalid Exception",
                        ExceptionType.INVALID_LASTNAME);
            }
        }
        
        //Function to check validity of Email
        public boolean validateEmail(String email) throws UserDetailInvalid {
            Pattern pattern=Pattern.compile(EMAIL_MATCH);
            boolean check=pattern.matcher(email).matches();
            if(check) {
                return check;
            }else {
                throw new UserDetailInvalid("Email Invalid Exception",
                        ExceptionType.INVALID_EMAIL);
            }
        }
        
        //Function to check validity of Mobile Phone number
        public boolean validatePhone(String phone) throws UserDetailInvalid {
            Pattern pattern=Pattern.compile(PHONE_MATCH);
            boolean check=pattern.matcher(phone).matches();
            if(check) {
                return check;
            }else {
                throw new UserDetailInvalid("Mobile Phone Number Invalid Exception",
                        ExceptionType.INVALID_PHONE);
            }
        }
        
        //Function to check validity of Password
        public boolean validatePassword(String pass) throws UserDetailInvalid {
            Pattern pattern=Pattern.compile(PASS_MATCH);
            boolean check=pattern.matcher(pass).matches();
            if(check) {
                return check;
            }else {
                throw new UserDetailInvalid("Password Invalid Exception",
                        ExceptionType.INVALID_PASSWORD);
            }
        }
}

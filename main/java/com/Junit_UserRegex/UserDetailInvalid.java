public class UserDetailInvalid extends Exception {
    
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    enum ExceptionType{                                //enum code to differenciate error types
        INVALID_FIRSTNAME,INVALID_LASTNAME,INVALID_EMAIL,
        INVALID_PHONE,INVALID_PASSWORD;
    }
    ExceptionType type_of_exception;
    public UserDetailInvalid(String message,ExceptionType type_of_exception) {
        super(message);
        this.type_of_exception=type_of_exception;
    }
}

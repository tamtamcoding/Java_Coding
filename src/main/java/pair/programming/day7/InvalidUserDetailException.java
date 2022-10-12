package pair.programming.day7;

public class InvalidUserDetailException extends Exception{
    public static final String NAME_IS_LESS =
            "Invalid Employee name. Must be at least 3 characters";

    public static final String AGE_NOT_IN_RANGE =
            "Invalid Employee age. must be between 18 - 65 years old";
    public static final String GENDER_INVALID =
            "Invalid Employee gender. must be female or male";

    public InvalidUserDetailException(String message) {
        super(message);
    }
}

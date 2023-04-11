package ss19_string_regex.exercise;

public class ValidatePhoneNumber {
    private static final String PHONE_NUMBER = "^[(]84[)]-[(]0[1-9]{9}[)]$";

    public static void main(String[] args) {
        String phoneNumber = "(84)-(0978489648)";
        System.out.println(phoneNumber.matches(PHONE_NUMBER));
    }
}

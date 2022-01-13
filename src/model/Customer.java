package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Customer {

   private String firstName;
   private String lastName;
   private String email;

    public Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;

        if(validateEmail(email)){
        this.email = email;
        }
    }

    public static boolean validateEmail(String email) {

        Pattern pattern = Pattern.compile("^[A-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[A-Z0-9_!#$%&'*+/=?`{|}~^-]+↵\n" +
                ")*@[A-Z0-9-]+(?:\\.[A-Z0-9-]+)*$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            return matcher.matches();
        } else {
            throw new IllegalArgumentException("Email format does not match the required specifications");
        }
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

}

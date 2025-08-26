public class LenghtPasswordValidator implements PasswordValidatorr {

    @Override
    public boolean validate(String password) {
       // return password.length() > 8;
        if (password.length() > 8) {
            return true;
        } else {
            System.out.println("hasło jest too short");
            return false;
        }
    }

}

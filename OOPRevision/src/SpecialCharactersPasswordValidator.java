public class SpecialCharactersPasswordValidator implements PasswordValidatorr {

    @Override
    public boolean validate(String password) {
      //  return password.contains("#") || password.contains("@");
        if (password.contains("#") || password.contains("%")) {
            return true;
        } else {
            System.out.println("password dont have any special characters");
            return false;
        }
    }
}

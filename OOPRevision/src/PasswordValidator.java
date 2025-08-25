public class PasswordValidator {
    public void validatorPassword(String password) {
        validateLenght(password);
        validateSpecialCharacters(password);
    }

    private void validateLenght(String password) {
        if (!(password.length() > 8)) {
            System.out.println("password is to short");
        }
    }

    private void validateSpecialCharacters(String password) {
        if (!(password.contains("#") || password.contains("%"))) {
            System.out.println("password dont have special characters");
        }
    }

}

package pl.classess.localclassess.zad4;

public class User {
    private String firstName;
    private String lastName;
    private String login;
    private String password;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName, Validator validator) {
        boolean isFirstNameValid = validator.validate(firstName);

        if (isFirstNameValid) {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName, Validator validator) {
        boolean isLastNameValid = validator.validate(lastName);

        if (isLastNameValid) {
            this.lastName = lastName;
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login, Validator validator) {
        boolean isLoginValid = validator.validate(login);

        if (isLoginValid) {
            this.login = login;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, Validator validator) {
        boolean isPasswordValid = validator.validate(password);

        if (isPasswordValid) {
            this.password = password;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

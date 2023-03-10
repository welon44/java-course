package pl.classess.localclassess.zad1;

public class UserValidator {

    public void validateEmails(String email, String alternativeEmail) {

        class Email {

            String email;

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            void validateEmail(String email) {
                if (email.isEmpty() || email.isBlank() || !email.contains("@")) {
                    setEmail("unknown");
                    System.out.println(getEmail());
                } else {
                    System.out.println(email);
                }
            }
        }

        Email emailClass = new Email();
        emailClass.validateEmail(email);
        emailClass.validateEmail(alternativeEmail);
    }
}

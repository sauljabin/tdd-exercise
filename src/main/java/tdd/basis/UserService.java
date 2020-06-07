package tdd.basis;

public class UserService {

    private final MailSender mailSender;

    public UserService(MailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void signUp(String email, String password){
        mailSender.sendMail(email, "Welcome!!!");
    }
}

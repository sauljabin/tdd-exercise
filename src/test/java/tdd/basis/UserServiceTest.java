package tdd.basis;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * VERIFICACIÓN DE COMPORTAMIENTO
 */
class UserServiceTest {

    @Test
    void sendWelcomeMailToNewUser() {
        MailSender mailSender = mock(MailSender.class);
        UserService userService = new UserService(mailSender);

        userService.signUp("sauljabin@gmail.com", "MyNewPassword123456");

        verify(mailSender).sendMail("sauljabin@gmail.com", "Welcome!!!"); // SE VERIFICA QUE INVOCA A LA DEPENDENCIA
    }
}
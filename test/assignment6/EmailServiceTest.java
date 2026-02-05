package assignment6;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmailServiceTest {

    @Test(expected = RuntimeException.class)
    public void sendEmail_shouldThrowException() {
        EmailService emailService = EmailService.getInstance();
        Order order = new Order();

        try {
            emailService.sendEmail(order);
        } finally {
            assertFalse(order.isCustomerNotified());
        }
    }

    @Test
    public void sendEmailWithCC_shouldReturnTrue() {
        EmailService emailService = EmailService.getInstance();
        Order order = new Order();

        boolean result = emailService.sendEmail(order, "cc@test.com");

        assertTrue(result);
        assertTrue(order.isCustomerNotified());
    }
}

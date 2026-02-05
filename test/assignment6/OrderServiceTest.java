package assignment6;

import org.junit.Test;

import static org.junit.Assert.*;

public class OrderServiceTest {

    @Test(expected = RuntimeException.class)
    public void placeOrder_shouldThrowException_andNotNotifyCustomer() {
        OrderService orderService = OrderService.getInstance();
        Order order = new Order();
        order.setPrice(200);

        try {
            orderService.placeOrder(order);
        } finally {
            assertEquals(240.0, order.getPriceWithTax(), 0.01);
            assertFalse(order.isCustomerNotified());
        }
    }

    @Test
    public void placeOrderWithCC_shouldReturnTrue_andNotifyCustomer() {
        OrderService orderService = OrderService.getInstance();
        Order order = new Order();
        order.setPrice(200);
        boolean result = orderService.placeOrder(order, "cc@test.com");
        assertTrue(result);
        assertEquals(240.0, order.getPriceWithTax(), 0.01);
        assertTrue(order.isCustomerNotified());
    }
}

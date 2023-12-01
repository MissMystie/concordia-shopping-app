package test.service;

import static org.junit.Assert.*;
import com.shashi.beans.OrderBean;
import com.shashi.beans.OrderDetails;
import com.shashi.beans.TransactionBean;
import com.shashi.service.impl.OrderServiceImpl;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

public class OrderServiceTest {

    @InjectMocks
    private OrderServiceImpl orderService;

  

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testPaymentSuccess() {
        String userName = "user123";
        double paidAmount = 100.0;


        String result = orderService.paymentSuccess(userName, paidAmount);

        assertEquals("Payment successful", result);
    }

    @Test
    public void testAddOrder() {
        OrderBean order = new OrderBean();


        boolean result = orderService.addOrder(order);

        assertTrue(result);
    }

    @Test
    public void testAddTransaction() {
        TransactionBean transaction = new TransactionBean();


        boolean result = orderService.addTransaction(transaction);

        assertTrue(result);
    }

    @Test
    public void testCountSoldItem() {
        String prodId = "prod456";


        int result = orderService.countSoldItem(prodId);

        assertEquals(5, result);
    }

    @Test
    public void testGetAllOrders() {
        List<OrderBean> orders = new ArrayList<>();
        orders.add(new OrderBean(/* order details */));
        orders.add(new OrderBean(/* order details */));


        List<OrderBean> result = orderService.getAllOrders();

        assertEquals(orders, result);
    }

    @Test
    public void testGetOrdersByUserId() {
        String emailId = "user@example.com";

        List<OrderBean> orders = new ArrayList<>();
        orders.add(new OrderBean(/* order details */));
        orders.add(new OrderBean(/* order details */));


        List<OrderBean> result = orderService.getOrdersByUserId(emailId);

        assertEquals(orders, result);
    }

    @Test
    public void testGetAllOrderDetails() {
        String userEmailId = "user@example.com";

        List<OrderDetails> orderDetailsList = new ArrayList<>();
        orderDetailsList.add(new OrderDetails(/* order details */));
        orderDetailsList.add(new OrderDetails(/* order details */));


        List<OrderDetails> result = orderService.getAllOrderDetails(userEmailId);

        assertEquals(orderDetailsList, result);
    }

    @Test
    public void testShipNow() {
        String orderId = "order123";
        String prodId = "prod456";


        String result = orderService.shipNow(orderId, prodId);

        assertEquals("Product shipped successfully", result);
    }
}


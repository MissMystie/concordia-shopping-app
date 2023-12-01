package test.service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import com.shashi.beans.UserBean;
import com.shashi.beans.UserType;
import com.shashi.service.impl.UserServiceImpl;

public class UserServiceTest {

    @InjectMocks
    private UserServiceImpl userService;


    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testRegisterUserWithStringParameters() {
        String userName = "John Doe";
        Long mobileNo = 1234567890L;
        String emailId = "john@example.com";
        String address = "123 Main St";
        int pinCode = 12345;
        String password = "password123";
        UserType userType = UserType.Student;


        String result = userService.registerUser(userName, mobileNo, emailId, address, pinCode, password, userType);

        assertEquals("User registered successfully", result);
    }

    @Test
    public void testRegisterUserWithUserBean() {
        UserBean user = new UserBean(/* your user details */);


        String result = userService.registerUser(user);

        assertEquals("User registered successfully", result);
    }

    @Test
    public void testIsRegistered() {
        String emailId = "john@example.com";


        boolean result = userService.isRegistered(emailId);

        assertTrue(result);
    }

    @Test
    public void testIsValidCredential() {
        String emailId = "john@example.com";
        String password = "password123";


        String result = userService.isValidCredential(emailId, password);

        assertEquals("Valid credentials", result);
    }

    @Test
    public void testIsValidCredential_Invalid() {
        String emailId = "john@example.com";
        String password = "invalidpassword";


        String result = userService.isValidCredential(emailId, password);

        assertEquals("Invalid credentials", result);
    }

    @Test
    public void testGetUserDetails() {
        String emailId = "john@example.com";
        String password = "password123";

        UserBean user = new UserBean();


        UserBean result = userService.getUserDetails(emailId, password);

        assertEquals(user, result);
    }

    @Test
    public void testGetFName() {
        String emailId = "john@example.com";


        String result = userService.getFName(emailId);

        assertEquals("John", result);
    }

    @Test
    public void testGetUserAddr() {
        String userId = "user123";


        String result = userService.getUserAddr(userId);

        assertEquals("123 Main St", result);
    }
}


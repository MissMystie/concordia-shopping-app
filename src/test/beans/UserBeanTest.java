package test.beans;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import com.shashi.beans.ProductInterest;
import com.shashi.beans.UserBean;
import com.shashi.beans.UserType;

public class UserBeanTest {

    private UserBean testUser;

    @Before
    public void setUp() {
        // Create a test user
        testUser = new UserBean("Test User", 1234567890L, "test@example.com", "Test Address", 12345, "testPassword",
                UserType.Student);
        testUser.setUserInterests(new HashSet<>());
    }

    @Test
    public void testGetName() {
        assertEquals("Test User", testUser.getName());
    }

    @Test
    public void testSetName() {
        testUser.setName("New Name");
        assertEquals("New Name", testUser.getName());
    }

    @Test
    public void testGetMobile() {
        assertEquals(Long.valueOf(1234567890L), testUser.getMobile());
    }

    @Test
    public void testSetMobile() {
        testUser.setMobile(9876543210L);
        assertEquals(Long.valueOf(9876543210L), testUser.getMobile());
    }

    @Test
    public void testGetEmail() {
        assertEquals("test@example.com", testUser.getEmail());
    }

    @Test
    public void testSetEmail() {
        testUser.setEmail("newemail@example.com");
        assertEquals("newemail@example.com", testUser.getEmail());
    }

    @Test
    public void testGetAddress() {
        assertEquals("Test Address", testUser.getAddress());
    }

    @Test
    public void testSetAddress() {
        testUser.setAddress("New Address");
        assertEquals("New Address", testUser.getAddress());
    }

    @Test
    public void testGetPinCode() {
        assertEquals(12345, testUser.getPinCode());
    }

    @Test
    public void testSetPinCode() {
        testUser.setPinCode(54321);
        assertEquals(54321, testUser.getPinCode());
    }

    @Test
    public void testGetPassword() {
        assertEquals("testPassword", testUser.getPassword());
    }

    @Test
    public void testSetPassword() {
        testUser.setPassword("newPassword");
        assertEquals("newPassword", testUser.getPassword());
    }

    @Test
    public void testGetUserType() {
        assertEquals(UserType.Student, testUser.getUserType());
    }

    @Test
    public void testSetUserType() {
        testUser.setUserType(UserType.Admin);
        assertEquals(UserType.Admin, testUser.getUserType());
    }

    @Test
    public void testGetUserInterests() {
        assertNotNull(testUser.getUserInterests());
    }

    @Test
    public void testSetUserInterests() {
        HashSet<ProductInterest> interests = new HashSet<>();
        interests.add(ProductInterest.ENCS);
        interests.add(ProductInterest.AAS);

        testUser.setUserInterests(interests);

        assertEquals(interests, testUser.getUserInterests());
    }

    @Test
    public void testClearUserInterests() {
        testUser.addUserInterest(ProductInterest.ENCS);

        testUser.clearUserInterests();

        assertTrue(testUser.getUserInterests().isEmpty());
    }




    @Test
    public void testRemoveUserInterest() {

        testUser.addUserInterest(ProductInterest.AAS);
        testUser.removeUserInterest(ProductInterest.AAS);

        assertFalse(testUser.getUserInterests().contains(ProductInterest.AAS));
    }


}



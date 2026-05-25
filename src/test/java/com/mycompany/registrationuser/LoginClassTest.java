/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.registrationuser;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author junio
 */
public class LoginClassTest {
    
    public LoginClassTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkPasswordComplexity method, of class LoginClass.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "";
        boolean expResult = false;
        boolean result = LoginClass.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class LoginClass.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "";
        String password = "";
        String phone = "";
        LoginClass instance = new LoginClass();
        String expResult = "";
        String result = instance.registerUser(username, password, phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkCellPhoneNumber method, of class LoginClass.
     */
    @Test
    public void testCheckCellPhoneNumber() {
        System.out.println("checkCellPhoneNumber");
        String cellphone = "";
        boolean expResult = false;
        boolean result = LoginClass.checkCellPhoneNumber(cellphone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class LoginClass.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String username = "";
        String password = "";
        LoginClass instance = new LoginClass();
        String expResult = "";
        String result = instance.returnLoginStatus(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isValidUsername method, of class LoginClass.
     */
    @Test
    public void testIsValidUsername() {
        System.out.println("isValidUsername");
        String username = "";
        boolean expResult = false;
        boolean result = LoginClass.isValidUsername(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of authenticate method, of class LoginClass.
     */
    @Test
    public void testAuthenticate() {
        System.out.println("authenticate");
        String loginUser = "";
        String loginPass = "";
        boolean expResult = false;
        boolean result = LoginClass.authenticate(loginUser, loginPass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

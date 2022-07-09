package com.everis.nttdata.gestiontareas;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UserEmailTest {

	@Test
    public void testValidEmailId() throws Exception {
        UserEmail email = new UserEmail();
        boolean result = email.isValidEmailId("cjsosa@nttdata.com");
        assertTrue(result, "email valido");
    }

    @Test
    public void testInvalidEmailId() throws Exception {
    	UserEmail email = new UserEmail();
        boolean result= email.isValidEmailId("cjsosa@nttdata");  
        assertFalse(result, "email invalido");
    }

    @Test
    public void testGetExistingEmailId() throws Exception {
    	UserEmail email = new UserEmail();
    	email.addUserEmailId("email1", "cjsosa@nttdata.com");
    	email.addUserEmailId("email2", "jjramirez@nttdata.com");
        String val = email.getUserEmailId("email2");
        assertNotNull("devuelve null si existe el email", val);
    }
    
}

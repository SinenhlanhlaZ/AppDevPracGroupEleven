package za.ac.cput.factory;

/*
    Doctor.java
    Entity: Doctor
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

import org.junit.jupiter.api.Test;

public class SecretaryFactoryTest {
    @Test
    public void testSecretary() {
        SecretaryFactory secFactory = new SecretaryFactory();
        SecretaryID sec = secFactory.getSecretaryName("2433");
        sec.secretaryID();
    }
}

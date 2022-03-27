package za.ac.cput.entities;

/*
    Doctor.java
    Entity: Doctor
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.factory.SecretaryFactory;
import za.ac.cput.factory.SecretaryID;

import static org.junit.jupiter.api.Assertions.*;

class SecretaryTest {

    @Test
    public void testSecretary() {
        SecretaryFactory secFactory = new SecretaryFactory();
        SecretaryID sec = secFactory.getSecretaryName("2433");
        sec.secretaryID();
    }
}
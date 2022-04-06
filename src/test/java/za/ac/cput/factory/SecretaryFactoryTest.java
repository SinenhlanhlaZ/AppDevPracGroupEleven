package za.ac.cput.factory;

/*
    Doctor.java
    Entity: Doctor
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

import org.junit.jupiter.api.Test;
import za.ac.cput.entities.Secretary;

public class SecretaryFactoryTest {
    @Test
    public void testSecretary() {
        Secretary sec = SecretaryFactory.createSecretary("Chloe", "Fraizer");
        System.out.println(sec);
    }
}

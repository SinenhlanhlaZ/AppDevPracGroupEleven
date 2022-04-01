package za.ac.cput.factory;

/*
    Entity: Secretary
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

public class Secretary implements SecretaryID {
    @Override
    public void secretaryID() {
        System.out.println("The name of the secretary is Chloe.");
    }
}

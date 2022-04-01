package za.ac.cput.factory;

/*
    Entity: Secretary
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

public class SecretaryFactory {
    public SecretaryID getSecretaryName(String secretaryID) {
        if(secretaryID == null) {
            return null;
        }
        if(secretaryID.equals("2433")) {
            return new Secretary();
        }
        return null;
    }
}

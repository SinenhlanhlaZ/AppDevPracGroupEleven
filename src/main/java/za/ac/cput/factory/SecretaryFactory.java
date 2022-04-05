package za.ac.cput.factory;

/*
    Entity: Secretary
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

import za.ac.cput.entities.Secretary;
import za.ac.cput.util.Helper;

public class SecretaryFactory {
    public static Secretary createSecretary(String secretaryFirstName, String secretaryLastName)
    {
        String secID = Helper.generateID();

        if(Helper.isNullorEmpty(secretaryFirstName) || Helper.isNullorEmpty(secretaryLastName))
        {
            return null;
        }
        return new Secretary.SecretaryBuilder().setID(secID)
                .setFirstName(secretaryFirstName).setLastName(secretaryLastName)
                .build();
    }
}

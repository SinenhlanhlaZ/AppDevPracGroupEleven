package za.ac.cput.repository;

/*
    Entity: Secretary
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

import za.ac.cput.entities.Secretary;

import java.util.ArrayList;

public class SecretaryRepository implements ISecretaryRepository {

    private static SecretaryRepository secRepository = null;
    private ArrayList<Secretary> secretaryArrayList = null;

    private SecretaryRepository() {
        secretaryArrayList = new ArrayList<Secretary>();
    }

    public static SecretaryRepository getRepository() {
        if(secRepository == null) {
            secRepository = new SecretaryRepository();
        }
        return secRepository;
    }

    @Override
    public Secretary create(Secretary sec) {
        boolean success = secretaryArrayList.add(sec);
        if(!success)
        {
            return null;
        }
        return sec;
    }

    public Secretary read(String secID) {
        for(Secretary s : secretaryArrayList)
        {
            if(s.getSecID().equals(secID))
            {
                return s;
            }
        }
        return null;
    }

    public Secretary update(Secretary sec)
    {
        Secretary s = read(sec.getSecID());
        if( s != null)
        {
            secretaryArrayList.remove(s);
            secretaryArrayList.add(sec);
            return sec;
        }
        return null;
    }

    @Override
    public boolean delete(String secID)
    {
        Secretary secretaryToBeDeleted = read(secID);
        if(secretaryToBeDeleted == null)
        {
            return false;
        }
        secretaryArrayList.remove(secretaryToBeDeleted);
        return true;
    }

    @Override
    public ArrayList<Secretary> getSecretaries()
    {
        return secretaryArrayList;
    }
}

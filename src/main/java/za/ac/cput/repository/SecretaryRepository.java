package za.ac.cput.repository;

/*
    Entity: Secretary
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

import za.ac.cput.entities.Secretary;

import java.util.ArrayList;

public class SecretaryRepository implements ISecretaryRepository {

    private static SecretaryRepository rep = null;
    private ArrayList<Secretary> secData = null;

    private SecretaryRepository() {
        secData = new ArrayList<Secretary>();
    }

    public static SecretaryRepository getRepository() {
        if(rep == null) {
            rep = new SecretaryRepository();
        }
        return rep;
    }

    @Override
    public Secretary create(Secretary sec) {
        boolean success = secData.add(sec);
        if(!success)
        {
            return null;
        }
        return sec;
    }

    @Override
    public Secretary read(String secID) {
        for(Secretary s : secData)
        {
            if(s.getSecID().equals(secID))
            {
                return s;
            }
        }
        return null;
    }

    @Override
    public void update() {

    }

    @Override
    public boolean delete() {
        return false;
    }

    @Override
    public ArrayList<Secretary> getSecretaries() {
        return null;
    }
}

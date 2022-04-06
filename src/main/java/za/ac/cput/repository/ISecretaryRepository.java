package za.ac.cput.repository;

/*
    Entity: Secretary
    Author: Sinenhlanhla Zondi (220008922)
    Date: 25 March 2022
*/

import za.ac.cput.entities.Secretary;

import java.util.ArrayList;

public interface ISecretaryRepository extends IRepository<Secretary, String>{

    public ArrayList<Secretary> getSecretaries();
}

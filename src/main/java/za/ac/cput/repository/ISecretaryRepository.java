package za.ac.cput.repository;

import za.ac.cput.entities.Secretary;

import java.util.ArrayList;

public interface ISecretaryRepository extends IRepository<Secretary, String>{

    public ArrayList<Secretary> getSecretaries();
}

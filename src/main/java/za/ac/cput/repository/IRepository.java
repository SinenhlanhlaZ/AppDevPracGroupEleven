package za.ac.cput.repository;

import za.ac.cput.entities.Secretary;

public interface IRepository<T, G> {
    T create(T t);
    T read(String id);
    T update(T t);
    boolean delete(String id);
}

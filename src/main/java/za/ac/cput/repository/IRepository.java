package za.ac.cput.repository;

import za.ac.cput.entities.Secretary;

// T => Object
// ID => Primary Key

public interface IRepository<T, ID> {
    T create(T t);
    T read(ID id);
    T update(T t);
    boolean delete(ID id);
}

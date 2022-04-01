package za.ac.cput.repository;

public interface IRepository<T, G> {
    T create(T);
    void read();
    void update();
    boolean delete();
}

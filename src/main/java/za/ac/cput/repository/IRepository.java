package za.ac.cput.repository;

public interface IRepository<T, G> {
    void create();
    void read();
    void update();
    boolean delete();
}

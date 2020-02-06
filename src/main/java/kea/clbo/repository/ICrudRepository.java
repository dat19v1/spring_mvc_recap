package kea.clbo.repository;

import java.util.List;

public interface ICrudRepository<T> {
    void create(T t);
    List<T> readAll();
    T read(int id);
    boolean update(T t);
    boolean delete(int id);
}


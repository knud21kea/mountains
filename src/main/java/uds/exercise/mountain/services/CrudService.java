package uds.exercise.mountain.services;

import java.util.Optional;
import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findall();
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
    Optional<T> findbyId(ID id);
}

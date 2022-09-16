package uds.exercise.mountain.repositories;

import org.springframework.data.repository.CrudRepository;
import uds.exercise.mountain.models.Mountain;

public interface MountainRepository extends CrudRepository<Mountain, Long>
{
}

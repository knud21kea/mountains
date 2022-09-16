package uds.exercise.mountain.services;

import org.springframework.stereotype.Service;
import uds.exercise.mountain.models.Mountain;
import uds.exercise.mountain.repositories.MountainRepository;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class MountainService implements IMountainService
{
    private final MountainRepository mRepository;

    public MountainService(MountainRepository mRepo) {
        mRepository = mRepo;
    }

    @Override
    public Set<Mountain> findall() {
        Set<Mountain> set = new HashSet<>();
        mRepository.findAll().forEach(set::add);
        return set;
    }

    @Override
    public Mountain save(Mountain object) {
        return mRepository.save(object);
    }

    @Override
    public void delete(Mountain object) {
        mRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        mRepository.deleteById(aLong);
    }

    @Override
    public Optional<Mountain> findbyId(Long aLong) {
        return mRepository.findById(aLong);
    }
}
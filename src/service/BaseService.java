package service;

import model.BaseModel;
import repository.BaseRepository;

import java.util.UUID;

public class BaseService <T extends BaseModel,R extends BaseRepository<T>> {
protected final R repository;

    public BaseService(R repository) {
        this.repository = repository;
    }
    public void add(T t){
        repository.add(t);
    }

    public void delete(UUID id){
        repository.delete(id);
    }

    public void update(UUID id, T list){
        repository.update(id, list);
    }

    public void findById(UUID id){
        repository.findById(id);
    }
}

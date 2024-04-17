package service;

import exception.DataNotFoundException;
import model.BaseModel;
import repository.BaseRepository;

import java.util.ArrayList;
import java.util.UUID;

public abstract class BaseService <T extends BaseModel,R extends BaseRepository<T>> {
    protected final R repository;

    public BaseService(R repository) {
        this.repository = repository;
    }

    public boolean add(T t) {
        if (check(t)){
            return false;
        }

        repository.add(t);
        return true;
    }

    public abstract boolean check(T t);

    public void delete(UUID id) {
        repository.delete(id);
    }

    public void update(UUID id, T list) {
        repository.update(id, list);
    }

    public void findById(UUID id) throws DataNotFoundException {
        repository.findById(id);
    }


    public ArrayList<T> getActives() {
        repository.getActives();
        return null;
    }

    public ArrayList<T> getAll(){
        return repository.getAll();
    }

}

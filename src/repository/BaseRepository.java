package repository;

import model.BaseModel;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;

public abstract class BaseRepository<T extends BaseModel> {
    protected ArrayList<T> data = new ArrayList<>();

    public void add(T t){
        data.add(t);
    }

    public void delete (UUID userOrProductAndOrderId){
        for (T t : data) {
            if(Objects.equals(t.getId(), userOrProductAndOrderId)){
                t.setActive(false);
            }
        }
    }


    public void update(UUID userOrProductAndOrderId, T t){
        int i = 0;
        for (T datum : data) {
            if (Objects.equals(datum.getId(), userOrProductAndOrderId)){
                t.setId(t.getId());
                data.set(i, t);
                return;
            }
            i++;
        }
    }


    public Optional<T> findById(UUID id) {
        for (T t : data) {
            if (Objects.equals(t.getId(), id)){
                return Optional.of(t);
            }
        }

        return Optional.empty();
    }


    public ArrayList<T> getActives(){
        ArrayList<T> list = new ArrayList<>();
        for (T t : data) {
            if (t.isActive()){
                list.add(t);
            }
        }

        return list;
    }

    public ArrayList<T> getAll(){
        return data;
    }
}

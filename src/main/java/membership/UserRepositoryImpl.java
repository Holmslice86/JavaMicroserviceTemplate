package membership;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public class UserRepositoryImpl implements UserRepository {

    public UserRepositoryImpl(){

    }


    @Override
    public User get(UUID id) {
        return null;
    }

    @Override
    public ArrayList<User> getAll() {
        ArrayList<User> list = new ArrayList<>();

        list.add(new User("bob", "dole"));
        list.add(new User("jackie", "chan"));

        return list;
    }

    @Override
    public void add(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void remove(UUID id) {

    }

}

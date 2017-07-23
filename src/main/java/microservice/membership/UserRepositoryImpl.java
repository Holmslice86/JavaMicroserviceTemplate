package microservice.membership;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class UserRepositoryImpl implements UserRepository {


    private List<User> userList;

    public UserRepositoryImpl() {
        userList = new ArrayList<>();
        userList.add(new User("bob", "dole"));
        userList.add(new User("jackie", "chan"));
    }


    @Override
    public Optional<User> get(UUID id) {
        Optional<User> result = userList.stream().filter(x -> x.Id() == id).findFirst();
        return result;
    }

    @Override
    public List<User> getAll() {

        return userList;
    }

    @Override
    public void add(User user) {
        userList.add(user);
    }

    @Override
    public void update(User user) {

    }

    @Override
    public void remove(UUID id) {
        Optional u = get(id);
        if (u.isPresent()) {
            userList.remove(u);
        }
    }

}

package membership;

import java.util.ArrayList;
import java.util.UUID;

public interface UserRepository {

    User get(UUID id);

    ArrayList<User> getAll();

    void add(User user);

    void update(User user);

    void remove(UUID id);

}

package microservice.membership;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository {

    Optional<User> get(UUID id);

    List<User> getAll();

    void add(User user);

    void update(User user);

    void remove(UUID id);

}

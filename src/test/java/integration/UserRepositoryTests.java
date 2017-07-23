package integration;

import microservice.membership.User;
import microservice.membership.UserRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserRepositoryTests {

    public UserRepositoryTests() {

    }

    @Autowired
    private UserRepository repository;

    @Test
    public void CrudTest() {

        User u = new User("Bob", "Dole");
        repository.add(u);

        Optional<User> o = repository.get(u.Id());
        Assert.assertTrue(o.isPresent());

        repository.remove(o.get().Id());

        Optional removedUser = repository.get(u.Id());

        Assert.assertFalse(removedUser.isPresent());
    }


}

package unit;

import microservice.membership.User;
import org.junit.Assert;
import org.junit.Test;

public class MembershipTests {


    @Test(expected = IllegalArgumentException.class)
    public void CreateUserWithNullFirstName_ThrowsException() {

        new User(null, "Dole");
    }

    @Test(expected = IllegalArgumentException.class)
    public void CreateUserWithNullLastName_ThrowsException() {

        new User("Bob", null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void CreateUserWithInvalidFirstName_ThrowsException(){
        new User("Bob1!","Dole");
    }

    @Test(expected = IllegalArgumentException.class)
    public void CreateUserWithInvalidLastName_ThrowsException(){
        new User("Bob","Dole5$");
    }

    @Test
    public void CreateValidUser_isSuccessful(){
        User u = new User("Bob","Dole");
        Assert.assertEquals("Bob",u.First());
        Assert.assertEquals("Dole",u.Last());
        Assert.assertNotNull(u.Id());
    }
}

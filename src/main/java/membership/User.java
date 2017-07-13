package membership;

import com.sun.javaws.exceptions.InvalidArgumentException;

import java.util.UUID;

public class User {

    private UUID id;
    private String first;
    private String last;

    public User(String first, String last) throws InvalidArgumentException {
        this.first = validateName(first);
        this.last = validateName(last);
        id = UUID.randomUUID();
    }

    public UUID getId(){
        return id;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String validateName(String name) throws InvalidArgumentException {

        boolean nameContainsInvalidCharacters = !name.chars().allMatch(Character::isLetter);

        if (nameContainsInvalidCharacters) {
            String[] s = {name, "Names can only contain letters"};
            throw new InvalidArgumentException(s);
        }
        return name;
    }

}

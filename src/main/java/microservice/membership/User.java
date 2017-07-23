package microservice.membership;

import java.util.UUID;

public class User {

    private UUID id;
    private String first;
    private String last;

    public User(String first, String last) throws IllegalArgumentException {
        this.first = validateName(first);
        this.last = validateName(last);
        id = UUID.randomUUID();
    }

    public UUID Id() {
        return id;
    }

    public String First() {
        return first;
    }

    public String Last() {
        return last;
    }

    public String validateName(String name) throws IllegalArgumentException {

        boolean nameContainsInvalidCharacters = name == null || !name.chars().allMatch(Character::isLetter);

        if (nameContainsInvalidCharacters) {
            throw new IllegalArgumentException("Names can only contain letters");
        }
        return name;
    }

}

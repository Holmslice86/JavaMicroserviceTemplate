package membership;

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

    public UUID getId(){
        return id;
    }

    public String getFirst() {
        return first;
    }

    public String getLast() {
        return last;
    }

    public String validateName(String name) throws IllegalArgumentException {

        boolean nameContainsInvalidCharacters = !name.chars().allMatch(Character::isLetter);

        if (nameContainsInvalidCharacters) {
            throw new IllegalArgumentException("Names can only contain letters");
        }
        return name;
    }

}

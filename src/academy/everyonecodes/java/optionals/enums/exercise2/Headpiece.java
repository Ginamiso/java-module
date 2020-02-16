package academy.everyonecodes.java.optionals.enums.exercise2;

public enum Headpiece {
    HAT ("light hat"),
    BEANIE("warm beanie");

    private final String description;

    Headpiece(String description){
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

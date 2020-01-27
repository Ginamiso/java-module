package academy.everyonecodes.java.optionals.enums.exercise2;

public enum HeadPiece {
    HAT ("light and blue"),
    BEANIE("warm and yellow")
    ;

    private final String description;

    HeadPiece(String description){

        this.description = description;
    }

    public String getDescription() {

        return description;
    }
}

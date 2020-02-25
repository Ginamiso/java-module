package academy.everyonecodes.java.week8.extraExercises.exercise1;


import java.util.Objects;

public class SMS {
    private String type;
    private String text;

    public SMS(String type, String text) {
        this.type = type;
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SMS sms = (SMS) o;
        return Objects.equals(type, sms.type) &&
                Objects.equals(text, sms.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, text);
    }
}
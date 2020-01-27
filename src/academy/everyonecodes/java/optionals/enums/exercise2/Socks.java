package academy.everyonecodes.java.optionals.enums.exercise2;

import jdk.jfr.Description;

import javax.management.Descriptor;

public enum Socks {
    GREENSOCKS("green socks with pois"),
    YELLOWSOCKS ("yellow socks with red stripes"),
    REDSOCKS("red socks with blue stars")
    ;
    private final String description;

    Socks(String description){

        this.description = description;
    }

    public String getDescription() {

        return this.description;
    }
}

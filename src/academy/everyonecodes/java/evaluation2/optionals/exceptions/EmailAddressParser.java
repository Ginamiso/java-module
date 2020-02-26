package academy.everyonecodes.java.evaluation2.optionals.exceptions;

import java.util.List;

public class EmailAddressParser {

    public EmailAddress parse(String email) throws InvalidEmailException {
        List<String> parsed = List.of(email.split("@"));
        if (parsed.size() == 2) {
            String username = parsed.get(0);
            String domain = parsed.get(1);
            return new EmailAddress(username, domain);
        }
        throw new InvalidEmailException("Invalid Email!");
    }
}


package academy.everyonecodes.java.optionals.exceptions;

import java.util.List;

public class ChatBot {
    public String handle(String input) {
        List<String> list = List.of(input.split(" "));
        if (input.isBlank()) {
            return "Argument not supported: " + input;
        }
        String firstArgument = list.get(0);
        String secondArgument = list.get(1);
        try {
            String firstOutput = checkFirstArgument(firstArgument);
            String secondOutput = checkSecondArgument(secondArgument, firstArgument);
            return firstOutput + secondOutput;
        } catch (WrongFirstArgumentException e) {
            return "Argument not supported: " + firstArgument;
        } catch (WrongSecondArgumentException e) {
            return "Argument not supported: " + secondArgument;
        }
    }

    String checkFirstArgument(String firstArgument) throws WrongFirstArgumentException {
        if (firstArgument.equals("temperature")) {
            return "Temperature ";
        }
        if (firstArgument.equals("lights")) {
            return "Lights ";
        }
        throw new WrongFirstArgumentException(firstArgument);
    }

    String checkSecondArgument(String secondArgument, String type) throws WrongSecondArgumentException {
        if (type.equals("lights")) {
            if (secondArgument.equals("on") || secondArgument.equals("off")) {
                return "switched " + secondArgument;
            }
        } else if (type.equals("temperature")) {
            try {
                int degrees = Integer.parseInt(secondArgument);
                if (degrees >= 0) {
                    return "raised by " + degrees;
                } else {
                    return "lowered by " + Math.abs(degrees);
                }
            } catch (NumberFormatException e) {
                throw new WrongSecondArgumentException(secondArgument);
            }
        }
        throw new WrongSecondArgumentException(secondArgument);
    }
}





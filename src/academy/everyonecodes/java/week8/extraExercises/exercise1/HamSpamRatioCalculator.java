package academy.everyonecodes.java.week8.extraExercises.exercise1;

import java.util.List;

public class HamSpamRatioCalculator {
    private SMSReader reader = new SMSReader();
    public String calculate() {
        List<SMS> list = reader.read();
        long ham = list.stream()
                .filter(sms -> sms.getType().equals("ham"))
                .count();
        long spam = list.size() - ham;
        long percentageHam = (ham*100)/list.size();
        long percentageSpam = (spam*100)/list.size();
        return "ham "+percentageHam+"%"+" spam "+percentageSpam+"%";
    }
}

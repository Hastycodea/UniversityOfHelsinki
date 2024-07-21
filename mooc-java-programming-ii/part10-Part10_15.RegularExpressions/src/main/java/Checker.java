

public class Checker {

    public Checker() {

    }
  
    public boolean isDayOfWeek(String string) {
        String days = "(mon)|(tue)|(wed)|(thu)|(fri)|(sat)|(sun)";
        if (string.matches(days)){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean allVowels(String string) {
        String vowels = "(a)|(e)|(i)|(o)|(u)";
        boolean result = false;
        for(int i = 0; i < string.length(); i++) {
            String[] parts = string.split("");
            if (!parts[i].matches(vowels)) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }
    
    public boolean timeOfDay(String string) {
        String time = "([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9]";
        
//        String[] parts = string.split(":");
//        int hours = Integer.valueOf(parts[0]);
        
        if (string.matches(time)) {
            return true;
        } else {
            return false;
        }
    }

}

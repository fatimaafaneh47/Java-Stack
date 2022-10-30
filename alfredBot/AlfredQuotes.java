import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you.", dayPeriod, name);
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return String.format("your time is %s",date.toString());
    }
    
    public String respondBeforeAlexis(String phrase) {
        
        if(phrase.indexOf("Alexis") > -1) {
            return "She's really of no help. What can I get for you?";
        }

        if (phrase.indexOf("Alfred") > -1) {
            return "At your service, naturally. How may I be of assistance?";
        }

        return "Right. And with that I shall retire.";
    }
    

}
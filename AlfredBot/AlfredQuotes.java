import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return String.format("Hello, %s. Lovely to see you.", name);
    }
    
    public String dateAnnouncement() {
        Date currentDate = new Date();
        return "It is currently " + currentDate;
    }
    
    public String respondBeforeAlexis(String conversation) {
        int a = conversation.indexOf("Alexis");
        int b = conversation.indexOf("Alfred");

        if(a > -1){
            return "Right away, sir. She certainly isn't sophisticated enough for that.";
        } else if (b > -1){
            return "At your service. As you wish, naturally";
        } else {
            return "Right. And with that I shall retire.";
        }
    }
    
	// BONUS
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely to see you", dayPeriod, name);
    }
}


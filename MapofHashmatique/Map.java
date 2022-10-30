import java.util.HashMap;
import java.util.Set;
public class Map{  
   public static void main(String[] args) {
    HashMap<String, String> trackList = new HashMap<String, String>();
    trackList.put("Hello", "hello from the other side");
    trackList.put("enchanted", "please dont be in love with someone else");
    trackList.put("style", "we never run out of style");
    trackList.put("love story", "romeo and julliet");
    String name = trackList.get("Hello");
    System.out.println(name);
    Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));    
        }

}
}
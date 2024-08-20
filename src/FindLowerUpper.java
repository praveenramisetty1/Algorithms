import java.util.HashMap;
import java.util.Map;

public class FindLowerUpper {
    public static void main(String[] args) {
        String input = "aaAAbcBCBcxX";
        Map<Character, Boolean> localCache = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            Character ch = input.charAt(i);
            if(Character.isDigit(ch)) {
                continue;
            }
            Character key = Character.toLowerCase(ch);
            // System.out.println("Key: " + key);
            if(localCache.containsKey(key)) {
                if(Character.isUpperCase(ch)) {
                    localCache.put(key, true);
                } else {
                    localCache.put(key, false);
                }
            } else {
                if(Character.isLowerCase(ch)) {
                    localCache.put(ch, false);
                }
            }
        }
        localCache.forEach((k,v) -> System.out.println("Key: " + k + ", Value: " + v));
    } 
}

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {

        String str = "stress";

        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for(char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet()) {

            if(entry.getValue() == 1) {
                System.out.println("First Non-Repeated Character: "
                                   + entry.getKey());
                break;
            }
        }
    }
}

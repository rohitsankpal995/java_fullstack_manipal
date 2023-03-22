package collectionOue;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public String countChars(String ip) {
        Map<Character, Integer> hm = new HashMap<>();

        for (char c : ip.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        StringBuilder op = new StringBuilder();

        for (var entry :hm.entrySet()) {
            op.append(entry.getKey()).append(entry.getValue()).append(",");
        }
        String res = op.substring(0, op.length() - 1);

       // System.out.println(res);
        return res;
    }
}
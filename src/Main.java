import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String roman = "MCMXCIV";

        Map<String, Integer> romanMap = new HashMap<>();
        romanMap.put("M", 1000);
        romanMap.put("D", 500);
        romanMap.put("C", 100);
        romanMap.put("L", 50);
        romanMap.put("X", 10);
        romanMap.put("V", 5);
        romanMap.put("I", 1);

        int result = 0;

        for (int i = 0; i < roman.length(); i++) {

            char current = roman.charAt(i); //gives current character of string
            //look up against the hash map and calculate
            int currentHash = romanMap.get(Character.toString(current));

            if(i+1 < roman.length()) { //if there is another value after current then gets it
                char next = roman.charAt(i+1);
                int nextHash = romanMap.get(Character.toString(next));

                if(currentHash < nextHash){
                    result -= currentHash;
                }else{
                    result += currentHash;
                }
            }
        }
        System.out.println(roman + " Equals " + result);




    }
}
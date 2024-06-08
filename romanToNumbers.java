import java.util.HashMap;
import java.util.Map;

class romanToNumbers {

    public static int romanToInt(String s) {
        
        // mapping roman numerials to value.
        Map<Character, Integer> m = new HashMap<>();
        
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);

        int sum = 0;

        // if a smaller number show up before a larger number, it is subtraction, else it is an addition.
        for (int i = 0; i < s.length(); i++) {
            if (i < (s.length() - 1) && (m.get(s.charAt(i)) < m.get(s.charAt(i + 1)))) {
                sum -= m.get(s.charAt(i));
            } else {
                sum += m.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        System.out.println(romanToInt("MCMXCIV"));
    }

}

import java.util.Arrays;

public class longestPrefix {
    
    public static String longestCommonPrefix(String[] strs) {

        // sort array so that it is ordered in alphabetical order
        Arrays.sort(strs);
        
        // grabs first and last value
        String s1 = strs[0];
        String s2 = strs[strs.length - 1];

        int prefixIndex = 0;

        while (prefixIndex < s1.length() && prefixIndex < s2.length()) {
            if(s1.charAt(prefixIndex) == s2.charAt(prefixIndex)) {
                prefixIndex++;
            } else {
                break;
            }
        }
        return s1.substring(0, prefixIndex);
    }

    public static void main(String args[]) {
        String arr[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(arr));
    }

}

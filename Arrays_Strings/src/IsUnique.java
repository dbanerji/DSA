import com.sun.org.apache.xpath.internal.operations.Bool;

public class IsUnique {
    public static boolean isUniqueChars(String str) {
        if(str.length()>128) {
            return false;
        }

            boolean[] dictionary = new boolean[128];

            for(int i =0;i < str.length(); i++){
                char ch = str.charAt(i);
                if(dictionary[ch]) return false;
                dictionary[ch] =true;
        }
            return true;

        }

        public static void main(String[] args) {
            String[] words = {"abcde", "hello", "apple", "kite", "padle"};
            for (String word : words) {
                System.out.println(word + ": " + isUniqueChars(word));
            }
        }

    }

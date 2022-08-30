public class oneAway {
        public static void main(String[] args) {
            String a = "palee";
            String b = "pale";
            boolean isOneEdit1 = oneEditAway(a, b);
            System.out.println(a + ", " + b + ": " + isOneEdit1);

            String c = "pale";
            String d = "pkle";
            boolean isOneEdit2 = oneEditAway(c, d);
            System.out.println(c + ", " + d + ": " + isOneEdit2);

            String e = "pale";
            String f = "bake";
            boolean isOneEdit3 = oneEditAway(e, f);
            System.out.println(e + ", " + f + ": " + isOneEdit3);
        }
        public static boolean oneEditAway(String word1, String word2){
            if(Math.abs(word1.length()-word2.length()) >1){
                return false;
            }
            int index1 = 0;
            int index2 = 0;
            String shorter = word1.length() < word2.length() ? word1 : word2;
            String longer = word1.length() < word2.length() ? word2 : word1;
            boolean difference = false;
            while(index2 < longer.length() && index1 < shorter.length()) {
                if (shorter.charAt(index1) != longer.charAt(index2)) {
                    if (difference) {
                        return false;
                    }
                    difference=true;
                    if (shorter.length() == longer.length()) {
                        index1++;
                    }
                } else {
                    index1++;
                }
                index2++;

            }
            return true;
        }

}

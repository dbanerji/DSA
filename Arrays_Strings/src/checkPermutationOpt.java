public class checkPermutationOpt {
    public static boolean checkpermopt(String s, String t) {
        int[] dictionary = new int[128];

        if(s.length()!=t.length()) return false;
        for (int i = 0; i < s.length(); i++) {

            dictionary[s.charAt(i)]++;
        }
        for (int j = 0; j < t.length(); j++) {

            dictionary[t.charAt(j)]--;
            if (dictionary[t.charAt(j)] < 0) return false;

        }
        return true;
    }

    public static void main(String[] args) {
        String[][] pair = {{"apple", "ufhuhs"}, {"Debs", "Adi"}, {"melon", "nelom"}};
        for (String[] apair : pair) {
            String word1 = apair[0];
            String word2 = apair[1];
            System.out.println("It is an anagram" + " " + word1 + "," + word2 + ": " + checkpermopt(word1, word2));

        }
    }
}
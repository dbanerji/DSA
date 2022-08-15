import java.util.Arrays;

public class checkPermutation {
    public static String sort(String s){

            char[] ch = s.toCharArray();
            Arrays.sort(ch);

        return new String(ch);
    }

    public static boolean checkperm(String s, String t){
        if(sort(s).equals(sort(t))){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        String[][] pair = {{"apple", "ufhuhs"}, {"Debs", "Adi"}, {"melon", "nelom"}};
        for (String[] apair : pair) {
            String word1 = apair[0];
            String word2 = apair[1];
            System.out.println("It is an anagram"+" "+word1+","+word2+": "+checkperm(word1,word2));
        }
    }
}

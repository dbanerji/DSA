import java.util.HashMap;

public class palindromePermutation {
    //Eg:Taco Cat
    //Ignore blanks and case
    //Unoptimized version 1
    public static void main(String[] args){
        String s = new String("Taco Cat");
        int i =countletters(s);
        int count=0;
        HashMap<Character,Integer> ans = fillhashmap(s);
        boolean permpallen =checkperm(ans, i);
        System.out.println(permpallen);

        }


    public static boolean checkperm(HashMap<Character,Integer> map, int count) {
    int numberofduplicates=0;
    int numberofsingles =0;
            for(Integer value : map.values()){
                if (value == 2) {
                    numberofduplicates++;

                } else if(value == 1) {
                    numberofsingles++;
                }
            }

        if(count % 2 == 0) {
            if (numberofduplicates == count / 2 && numberofsingles == 0) {
                return true;
            }
        }
        else{
            if(numberofduplicates == (count/2) && numberofsingles ==1 )
                return true;
            }
    return false;

    }

    public static int countletters(String s){
        int count =0;
        s = s.toLowerCase().replaceAll(" ", "");
        System.out.println(s);
        for(int i =0 ; i < s.length(); i++){
           char ch = s.charAt(i);
           if(ch>='a'&& ch<='z'){
               count++;
           }
        }
        return count;
    }
    public static HashMap fillhashmap(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        s = s.toLowerCase().replaceAll(" ", "");
        for(int i =0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        return map;
    }
}

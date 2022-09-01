public class stringCompression {
    public static void main(String[] args){
        String str = "aabbcccaaaaae";
        String newStr = compressString(str);
        System.out.println(newStr);
    }
    public static String compressString(String str){
        int countOccurences=0;
        StringBuilder newStr= new StringBuilder();
        for(int i =0; i<str.length(); i++){
            countOccurences++;
            if((i+1) >= str.length() || str.charAt(i+1)!= str.charAt(i)){
                newStr.append(str.charAt(i));
                newStr.append(countOccurences);
                countOccurences =0;
            }
        }
        return (newStr.length() < str.length()) ? newStr.toString() : str;
    }
}

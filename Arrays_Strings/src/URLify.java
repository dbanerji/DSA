public class URLify {
    //Finds spaces and replaces them with %20
    //"Mr John Smith    " true length =13 becomes "Mr%20John%20Smith"

    public static int countofblanks(char[] s, int start, int end, char target){
        int count=0;
        for(int i=start;i<end;i++){
            if(s[i]==target){
                count++;
            }
        }
        return count;
    }

    public static void convertblanks(char[] s, int truelength) {

        int noOfBlanks = countofblanks(s, 0, truelength, ' ');
        int newindex = truelength - 1 + noOfBlanks * 2;
        //excess spaces that are not required.
        if(newindex+1 < s.length){
            s[newindex+1] ='\0';
        }
        for (int i = truelength - 1; i >= 0; i--) {
            if (s[i] == ' ') {
                s[newindex] = '0';
                s[newindex - 1] = '2';
                s[newindex - 2] = '%';
                newindex = newindex - 3;
            } else {
                s[newindex] = s[i];
                newindex--;
            }
        }
    }
    public static int findLastCharacter(char[]s){
        int len;
        for(int i=s.length-1;i>=0;i--){
            if(s[i]!=' '){
                return i;
            }
        }
        return -1;
    }
        public static void main(String[] args) {
            String str = "Miss Deboshruti Banerji    ";
            char[] arr = str.toCharArray();
            int trueLength = findLastCharacter(arr) + 1;
            convertblanks(arr, trueLength);
            for(char anarr : arr){
                System.out.print(" " + anarr + " ");
            }
        }
    }




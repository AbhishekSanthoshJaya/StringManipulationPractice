public class StringManipulationExample {
    public static void main(String[] args) {
        StringManipulationExample s1 = new StringManipulationExample();
        String[] mainString = new String[]{"Canada", "India", "Abhishek", "Toronto","North York"};
        for (int i = 0; i < mainString.length; i++) {
         // System.out.println(s1.zigZagReverse(mainString[i]));
            //System.out.println(s1.zigZagMyString(mainString[i]));
            //System.out.println(s1.oddEvenSwap(mainString[i]));
           System.out.println(s1.myReverse(mainString[i]));
        }
    }

    public String reverseString(String revString) {
        char[] revStore = revString.toCharArray();
        for (int i = 0, j = revString.length()- 1; i < revString.length() / 2; i++,j--) {
            char t = revStore[i];
            revStore[i] = revStore[j];
            revStore[j] = t;
        }
        return new String(revStore);
    }

    public String zigZagReverse(String input) {
        String twoString;
        String finalString = "";
        String finalString1 = "";
        String finalString2 = "";

        //char[] stores = input.toCharArray();

        for (int i = 0, j = i + 1; i < input.length() - 1; i += 2, j += 2) {
            twoString = input.substring(i, j + 1);
            finalString += reverseString(twoString);
        }
        if (input.length() % 2 == 1) {
            String firstPart = input.substring(0, input.length() / 2);
            String secondPart = input.substring(input.length() / 2, input.length() - 1);
            for (int i = 0, j = i + 1; i < firstPart.length() - 1; i += 2, j += 2) {
                String firstPart2 = firstPart.substring(i, j + 1);
                finalString1 += reverseString(firstPart2);
            }
            for (int i = 0, j = i + 1; i < secondPart.length()-1; i += 2, j += 2) {
                String secondPart2 = secondPart.substring(i, j + 1);
                finalString2 += reverseString(secondPart2);
            }
            finalString = finalString1 + input.charAt(input.length() - 1) + finalString2;
        }
        return finalString;
    }

    public static String zigZagMyString(String s)
    {
        String temp ;
        char names[] = s.toCharArray();
        char output[] = s.toCharArray();
        int len = names.length;
        int count = len - len % 2;

        for(int i = 0; i < count; i+=2)
        {
            output[i] = names[i+1];
            output[i+1] = names[i];
        }
        temp = new String(output);
        if (len % 2 == 1)
        {
            String firstPart = temp.substring(0, len / 2);
            //System.out.println("First Part : " + firstPart) ;
            String secondPart = temp.substring(len / 2, len - 1);
            //System.out.println("Second Part : " + secondPart) ;
            temp = firstPart + output[output.length - 1] + secondPart;
            //i = i + 1;
        }

        return temp;

    }
    public String oddEvenSwap(String s) {
        char[] evens = s.toCharArray();
      //  char[] odds = s.toCharArray();

        for (int i = 0; i < s.length()-1; i+=4)
        {
            if(i+2 < s.length()) {
                char t = evens[i];
                evens[i] = evens[i+2];
                evens[i+2] = t;
            }
        }

        for(int j =1; j<s.length()-1;j+=4){
            if(j+2 < s.length()) {
                char t = evens[j];
                evens[j] = evens[j+2];
                evens[j+2] = t;
            }
        }
        String temp = new String(evens);
        return temp;
    }

    public String myReverse(String s){
        char[] rev = s.toCharArray();
        for(int i = 0; i <rev.length-1; i+=2){
            char t = rev[i];
            rev[i] = rev[i+1];
            rev[i+1] = t;
        }
        String temp1 = new String(rev);
        if(rev.length % 2 == 1){
            String firstPart = temp1.substring(0,rev.length/2);
            String secondPart = temp1.substring(rev.length/2, rev.length-1);
            String finalString = firstPart + rev[rev.length-1] + secondPart;
            String temp2 = new String(finalString);
            return temp2;
        }
        else return temp1;
    }
}

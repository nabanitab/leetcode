package string;

public class ReverseMF {

    public static void main(String args[]){
        String str = "MF" ;
        String result = reverseWord(str);
        System.out.println(result);
    }

    public static String reverseWord(String str){

        StringBuilder sb = new StringBuilder();

       for (int i = str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));

       }
       return sb.toString();
    }
}

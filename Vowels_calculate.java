public class Vowels_calculate {
    public static void main( String args[]){
        String S = "I am a good Boy";
        int count = 0;
        for (int i=0 ; i<S.length(); i++){
            char ch = S.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u' || ch == 'I'){
                System.out.println(S.charAt(i));
               count ++;
            }
        }
        System.out.println(count);
    }
}

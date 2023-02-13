// Q(6).  Write a program to check if the letter ‘e’ is present in the world ‘umbrella’ . 

public class Product1 {


    static boolean isWordPresent (String sentence, String word) {
        String []s = sentence.split(" ");


        for ( String temp :s) {
            if (temp.compareTo(word) == 0) {
              return true;
            }
        }
        return false;


    }
    public static void main (String[] args) {
     
               String s = "umbrella";
               String word = "u";


               if(isWordPresent(s, word)){
               System.out.println("present");
               }
               else{
               System.out.println( "Not Present" );
               }
           
    }
}



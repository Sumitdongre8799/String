/*Q(4).  How do you compare to two strings in java ?  give an example .
It is used in authentication (by equals() method), sorting (by compareTo() method), reference matching (by == operator) etc.
There are three ways to compare String in Java:

By Using equals() Method
By Using == Operator
By compareTo() Method*/

// NOTE : --- ****   ALL THREE EXAMPLE ARE SEPRETLY RUN THE CODE *********** 

// Example 1:-  by using equal() method
class stringcomparison1 {
    public static void main(String args[]) {
        String s1 = "Sachin";
        String s2 = "SACHIN";
        System.out.println(s1.equals(s2));// false
        System.out.println(s1.equalsIgnoreCase(s2));// true
    }
}

// Example 2 - // by using == operator

class stringcomparison2 {
    public static void main(String args[]) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        System.out.println(s1 == s2);// true (because both refer to same instance)
        System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)
    }
}

// Example 3 :- by using compareTo()method

public class stringcomparison3 {
    public static void main(String args[]) {
        String str = "Hello World";
        String anotherString = "hello world";
        Object objStr = str;

        System.out.println(str.compareTo(anotherString));
        System.out.println(str.compareToIgnoreCase(anotherString));
        System.out.println(str.compareTo(objStr.toString()));
    }
}

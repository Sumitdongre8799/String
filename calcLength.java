// Q(3).  How do you find the length of a string in java explain with an example ?

// strings are objects created using the string class and the length() method is a public member method of this class. So, any variable of type string can access this method using the . (dot) operator.
// The length() method counts the total number of characters in a String.

public class calcLength {
    public static void main(String args[]) {
        String Name = "EDUCATION IS THE MOST IMPORTANT WEAPON THAT WE CAN USE TO CHANGE THE WORLD";
        int length = Name.length();
        System.out.println("The length of the string : " + Name + " is : " + length);
    }
}

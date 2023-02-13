// Q(2). How do you concatenate two string in java ? give an example .
//
// The technique of connecting two or more string together to create a new string is known as string concatenation .

// EX 1.
import java.util.*;

public class ConcatPattern {
    public static void main(String argos[]) {
        String s1 = "Computer";
        String s2 = "Science";
        String s3 = s1.concat(s2);

        String s4 = "Engineer";
        String s5 = s3.concat(s4);

        System.out.println(s3);
        System.out.println(s5);
    }
}

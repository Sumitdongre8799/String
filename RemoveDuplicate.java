//
//Q(1). Wap (Write a program) to remove duplicate from a string  ( take any string example with duplicate character ) 

class RemoveDuplicate {
  public static void main(String[] args) {

    String str1 = "StringInJavaDuplicateValue";
    System.out.println("The given string is: " + str1);
    System.out.println("After removing duplicates characters the new string is: " + removeDuplicateChars(str1));
  }

  private static String removeDuplicateChars(String sourceStr) {
    char[] arr1 = sourceStr.toCharArray();
    String targetStr = "";
    for (char value : arr1) {
      if (targetStr.indexOf(value) == -1) {
        targetStr += value;
      }
    }
    return targetStr;
  }

}

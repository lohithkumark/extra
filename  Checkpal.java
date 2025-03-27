class Checkpal
 {
    public static void checkPalindrome(String str) {
        char[] chars = str.toCharArray();  // Convert the string to a character array
        int left = 0;
        int right = chars.length - 1;
        // Compare characters from both ends towards the center
        while (left < right) {
            if (chars[left] != chars[right]) {
                System.out.println("'" + str + "' is not a palindrome.");
                return; 
            }
            left++; 
            right--; 
        }
        System.out.println("'" + str + "' is a palindrome.");
    }
    
    public static void main(String[] args) {
        String word = "madam";  
        checkPalindrome(word);  
    }
}


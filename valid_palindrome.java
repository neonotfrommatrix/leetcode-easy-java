class Solution {
    public boolean isPalindrome(String s) {
        
        /*first we need to change the sentence into a string, taking out dashes, or commas, or spaced
        
            then we have two pointers on each side working their way in, checking to see if its equal
            
            if all is equal; then palindrome
            
            if not then not a palindrome
        
        */
        
        String fixed_string = "";       //creates a variable that we will place a fixed string at
        
        //s.toCharArray makes our string into a character array
        //Character.isDigit or isLetter are methods
        
        for (char c : s.toCharArray()) {            // for loop to add each charachter to string without spaces
            if (Character.isDigit(c) || Character.isLetter(c)) {   // or periods, etc.
                fixed_string = fixed_string + c;
            }
        }
        
        fixed_string = fixed_string.toLowerCase();
        
        int a_pointer = 0;
        int b_pointer = fixed_string.length()-1;
        
        while (a_pointer <= b_pointer) {
            if (fixed_string.charAt(a_pointer) != fixed_string.charAt(b_pointer)) {
                return false;
            }
            a_pointer++;
            b_pointer--;
        }
        
        return true;
        
    }
}

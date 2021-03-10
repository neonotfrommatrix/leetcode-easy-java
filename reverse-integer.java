class Solution {
    public int reverse(int x) {
        
        // 123 3 is in ones place, 2 is in 10s place, ad 1 is in hundreds place
        
        /*traverse backwards by getting 3 2 1 
        
        123 / 10 = 12 with remainder of 3, pop is always going to be the last digit 
        
        dividing by 10 decreases the string
        
        
        
        */
        
        int reversed = 0;                           // we will return a reversed integer
        int pop;                                    // create a pop to get the last number
        
        while (x != 0) {                            // while the number is not 0 (ex. 123 atm)
            pop = x % 10;                           // get last digit off (pop = 3)
            x /= 10;                                // x = x / 10 so number is now 12
            
            // check unsigned ints boundaries
            if (reversed > Integer.MAX_VALUE/10 || reversed == Integer.MAX_VALUE/10 && pop > 7) return 0;
            if (reversed < Integer.MIN_VALUE/10 || reversed == Integer.MIN_VALUE/10 && pop < -8) return 0;
            
            reversed = (reversed * 10) + pop;       // 0 = (0* 10) + 3. it now has the 3 inside of it.
        }
        return reversed;
        
    }
}

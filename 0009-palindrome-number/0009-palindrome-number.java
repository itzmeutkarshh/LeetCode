class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int r;
        int pal = x;
        while(x>0){
            r = x%10;
            rev = rev * 10 + r;
            x = x/10;

        }
        if (pal == rev ){
          return true; 
        }else {
            return false;
        }
        
         
               
    }
    
}
class Solution {
    public int reverse(int x) {
        long rev = 0;
        int r;
        while(x!=0){
            r = x % 10;
            rev = rev * 10 + r;
            x = x/10;

        }
        if(rev<Math.pow(-2,31) || rev>Math.pow(2,31)-1)
            return 0;
        else
            return (int)rev;
        
    }
}
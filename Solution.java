class Solution {
    public boolean isPowerOfFour(int n) {
        if (n == 1) return true;
        if (n == 0) return false;
        while (true){
            if (n%4 == 0)
                n = n/4;
            else
                break;
        }
        return n==1;
    }
}
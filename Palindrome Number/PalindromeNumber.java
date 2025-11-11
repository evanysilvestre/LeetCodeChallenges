class PalindromeNumber {
    public boolean isPalindrome(int x) {
        int aux=x;
        int rev=0;

        if (x<0) {
            return false;
        } else {
            while(aux>0){
            rev=(rev*10)+(aux%10);
            aux/=10;
        }
        return rev==x;
        }
    }
}
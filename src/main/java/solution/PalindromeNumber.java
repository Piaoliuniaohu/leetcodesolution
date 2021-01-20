package solution;

/**
 * @author chenshaojian
 * @date 1/19/21
 * @time 11:15 AM
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        int result = 0;
        int pre = x;
        while(x>9){
            result = result*10 + x%10;
            x /= 10;
        }
        result = result*10 + x;
        return result == pre;
    }
}

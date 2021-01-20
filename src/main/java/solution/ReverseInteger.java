package solution;

/**
 * @author chenshaojian
 * @date 1/19/21
 * @time 8:55 AM
 */
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;
        if(x>Integer.MAX_VALUE||x<Integer.MIN_VALUE){
            return 0;
        }
        while(Math.abs(x)>9){
            result=result*10+x%10;
            x=x/10;
        }

        if(
                Math.abs(result)>Integer.MAX_VALUE/10||(result == Integer.MAX_VALUE/10&&x>7)
                        ||(result == Integer.MIN_VALUE/10&&x<-8)
        ){
            return 0;
        }else{
            result = result*10+x%10;

            return result;
        }
    }
}

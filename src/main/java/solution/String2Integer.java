package solution;

/**
 * @author chenshaojian
 * @date 1/19/21
 * @time 9:14 AM
 */
public class String2Integer {
    public int myAtoi(String s){
        int i = 0;
        int sign = 1;
        for(i = 0;i<s.length();i++){
            if(!Character.isSpaceChar(s.charAt(i))){
                break;
            }
        }

        String noEmpty = s.substring(i);
        for(i = 0;i<noEmpty.length();i++){
            char c = noEmpty.charAt(i);
            if(0==i){
                if('-' == c){
                    sign = -1;
                }else if('+' == c){
                    sign = 1;
                }else if(!Character.isDigit(c)){
                    return 0;
                }
            }else{
                if(!Character.isDigit(c)){
                    break;
                }
            }
        }
        String result = noEmpty.substring(0,i);
        try{
            if(result.length() == 0){
                return 0;
            }
            if(result.length() == 1&&(result.equals("-")||result.equals("+"))){
                return 0;
            }
            return Integer.parseInt(result);
        }catch (NumberFormatException e){
            if(sign == -1){
                return Integer.MIN_VALUE;
            }else {
                return Integer.MAX_VALUE;
            }
        }
    }
}

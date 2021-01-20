package solution;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenshaojian
 * @date 1/18/21
 * @time 10:19 AM
 */
public class ZigZagConversion {
    public String convert(String s, int numRows){

        char[] chars = s.toCharArray();
        List<StringBuffer> builderList = new ArrayList<StringBuffer>();
        int i = 0;
        int direction = 1;
        boolean isNew = true;
        for(char c:chars){
            if(isNew){
                builderList.add(new StringBuffer());
            }
            builderList.get(i).append(c);

            if(i+1==numRows){
                direction = -1;
                isNew = false;
            }
            if(i==0&&!isNew){
                direction = 1;
            }
            if(numRows!=1) {
                i += direction;
            }

        }
        StringBuilder result = new StringBuilder();
        for(StringBuffer builder:builderList){
            result.append(builder);
        }

        return result.toString();
    }
}

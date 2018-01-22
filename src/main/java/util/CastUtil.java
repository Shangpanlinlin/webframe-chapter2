package util;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.apache.commons.lang3.StringUtils;

public class CastUtil {

    public static  String castString(Object obj){
        return castString(obj, "");
    }

    private static String castString(Object obj, String defaultValue) {
        return obj != null? String.valueOf(obj): defaultValue;
    }

    public  static double castDouble(Object obj){
        return castDouble(obj, 0);
    }

    private static double castDouble(Object obj, int defaultValue) {
        double value = defaultValue;
        String strValue  = castString(obj);
        if(StringUtils.isNotEmpty(strValue)){
            try{
                value = Double.parseDouble(strValue);
            }catch (NumberFormatException e){
                value = defaultValue;
            }

        }
        return value;
    }

    public static long castLong(Object obj){
        return castLong(obj, 0);
    }

    private static long castLong(Object obj, long defaultValue) {
        long value = defaultValue;
        if(obj != null){
            String strValue = castString(obj);
            if(StringUtils.isNotEmpty(strValue)){
                try {
                    value = Long.valueOf(strValue);
                }catch (NumberFormatException e){
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    public static int castInteger(Object o) {
        return castInteger(o, 0);
    }

    private static int castInteger(Object o, int defaultValue) {
        int value  = defaultValue;
        if(o != null){
            String strValue = castString(o);
            if(StringUtils.isNotEmpty(strValue)){
                try {
                    value = Integer.valueOf(strValue);
                }catch (NumberFormatException e){
                    value = defaultValue;
                }
            }
        }
        return value;
    }

    public static boolean castBoolean(Object obj) {
        return castBoolean(obj, false);
    }

    private static boolean castBoolean(Object obj, boolean b) {
        boolean value = b;
        if(obj != null){
            value = Boolean.valueOf(castString(obj));
        }
        return value;
    }
}

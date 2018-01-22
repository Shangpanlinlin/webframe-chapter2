package util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class PropsUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(PropsUtil.class);

    public static Properties loadProperties(String filename) {
        Properties props = null;
        InputStream is = null;
        try {
            is = Thread.currentThread().getContextClassLoader().getResourceAsStream(filename);
            if (is == null)
                throw new FileNotFoundException(filename + " file is not found");
            props = new Properties();
            props.load(is);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            LOGGER.error("load properties file failure", e);
        } finally {
            if (is != null)
                try {
                    is.close();
                } catch (IOException e) {
                    LOGGER.error("close input stream failure", e);
                }
        }
        return props;
    }

    public static String getString(Properties props, String key){
       return  getString(props,key,"");
    }

    public static String getString(Properties props, String key, String defaulTValue){
        String value = defaulTValue;
        if(props.contains(key)){
            value = props.getProperty(key);
        }
        return value;
    }

    public static Integer getInt(Properties props, String key){
        return getInt(props, key, 0);
    }

    private static int getInt(Properties props, String key, int defualtValue) {
        int value = defualtValue;
        if(props.contains(key)){
            value = CastUtil.castInteger(props.get(key));
        }
        return value;
    }
    public static boolean getBoolean(Properties props, String key){
        return getBoolean(props, key, false);
    }

    private static boolean getBoolean(Properties props, String key, boolean defaultValue) {
        boolean value = defaultValue;
        if (props.contains(key)) {
            value = CastUtil.castBoolean(props.getProperty(key));
        }
        return value;
    }
}


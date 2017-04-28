package zhy2002.neutron.util;

import com.google.gwt.i18n.shared.DateTimeFormat;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ValueUtil {

    private static Logger logger = Logger.getLogger(ValueUtil.class.getSimpleName());
    private static DateTimeFormat yearFormat = new SharedDateTimeFormat("yyyy");

    private ValueUtil() {
    }

    public static boolean isEmpty(String value) {
        return value == null || value.length() == 0;
    }

    public static <T> T ifNull(T value, T defaultValue) {
        return value == null ? defaultValue : value;
    }

    public static String nodeNameToLabel(String name) {
        if (isEmpty(name))
            return name;

        if (Character.isDigit(name.charAt(0))) {
            try {
                int newValue = Integer.parseInt(name) + 1;
                return String.valueOf(newValue);
            } catch (NumberFormatException ex) {
                logger.log(Level.FINE, "Node name '" + name + "' cannot be converted to an integer.");
                return name;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        int end = name.length() - 1;
        if (name.endsWith("Node")) {
            end -= 4;
        }

        for (int i = 0; i <= end; i++) {
            char ch = name.charAt(i);
            if (Character.isUpperCase(ch)) {
                stringBuilder.append(' ');
            }
            if (i == 0) {
                ch = Character.toUpperCase(ch);
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }

    public static int getCurrentYear() {
        return Integer.parseInt(yearFormat.format(new Date()));
    }

    public static String beforeFirst(String src, String part) {
        int index = src.indexOf(part);
        if (index < 0)
            return src;
        return src.substring(0, index);
    }

    public static String camelToConstantLower(String name) {
        StringBuilder result = new StringBuilder();
        for (char ch : name.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                result.append('_');
                result.append(Character.toLowerCase(ch));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static boolean isInstanceOf(Object object, Class clazz) {
        if(object == null)
            return false;
        Class objClass = object.getClass();
        while (objClass != null) {
            if(clazz == objClass)
                return true;
            objClass = objClass.getSuperclass();
        }
        return false;
    }
}

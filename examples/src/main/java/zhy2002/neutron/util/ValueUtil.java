package zhy2002.neutron.util;

import java.util.logging.Level;
import java.util.logging.Logger;

public final class ValueUtil {

    private static Logger logger = Logger.getLogger(ValueUtil.class.getSimpleName());

    private ValueUtil() {
    }

    public static boolean isEmpty(String value) {
        return value == null || value.length() == 0;
    }

    public static <T> T ifNull(T value, T defaultValue) {
        return value == null ? defaultValue : value;
    }

    public static String nodeNameToLabel(String name) {
        if(isEmpty(name))
            return name;

        if(Character.isDigit(name.charAt(0))) {
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
        if(name.endsWith("Node")) {
            end -= 4;
        }

        for(int i=0; i<=end; i++) {
            char ch = name.charAt(i);
            if(Character.isUpperCase(ch)) {
                stringBuilder.append(' ');
            }
            if(i == 0) {
                ch = Character.toUpperCase(ch);
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}

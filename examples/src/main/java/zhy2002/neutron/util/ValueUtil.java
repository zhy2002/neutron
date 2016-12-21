package zhy2002.neutron.util;

public final class ValueUtil {

    private ValueUtil() {
    }

    public static boolean isEmpty(String value) {
        return value == null || value.length() == 0;
    }

    public static <T> T ifNull(T value, T defaultValue) {
        return value == null ? defaultValue : value;
    }
}

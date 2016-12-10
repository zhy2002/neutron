package zhy2002.neutron.util;

public final class ValueUtil {

    private ValueUtil() {
    }

    public static boolean isEmpty(String value) {
        return value == null || value.length() == 0;
    }

}

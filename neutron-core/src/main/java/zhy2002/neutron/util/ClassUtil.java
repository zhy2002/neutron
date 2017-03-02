package zhy2002.neutron.util;

/**
 * Class related util methods
 */
public final class ClassUtil {

    private ClassUtil() {
    }

    public static boolean isInstanceOf(Class clazz, Object object) {
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

package zhy2002.neutron.util;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class CollectionUtil {

    private CollectionUtil() {
    }

    @SafeVarargs
    public static <T> Collection<T> combine(Collection<T> collection, T... items) {
        List<T> list = new ArrayList<>(collection);
        list.addAll(Arrays.asList(items));
        return list;
    }
}

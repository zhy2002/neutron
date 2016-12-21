package zhy2002.neutron.util;

import java.util.LinkedList;

/**
 * A linked list with extra helper methods.
 */
public class EnhancedLinkedList<E> extends LinkedList<E> {

    public EnhancedLinkedList<E> and(E item) {
        add(item);
        return this;
    }

}

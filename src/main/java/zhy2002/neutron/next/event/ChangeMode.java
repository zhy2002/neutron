package zhy2002.neutron.next.event;

/**
 * Created by john.zhang on 4/11/2016.
 */
public enum ChangeMode {
    /**
     * All changes cause other changes (trigger rules).
     */
    CASCADE,
    /**
     * All changes do not cause other changes.
     */
    DIRECT,
    /**
     * All changes are ignored.
     */
    IGNORED,
    /**
     * All changes are prohibited (cause exception and everything in the current cycle will rollback).
     */
    PROHIBITED
}

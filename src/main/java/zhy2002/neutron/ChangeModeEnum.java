package zhy2002.neutron;

/**
 * Restrictions to changes in a phase.
 */
public enum ChangeModeEnum {
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

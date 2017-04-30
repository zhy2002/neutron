package zhy2002.neutron;

/**
 * Determines how changes should propagate.
 */
public enum ChangeModeEnum {
    /**
     * All changes cause other changes (trigger rules).
     */
    CASCADE,
    /**
     * All changes do not cause other changes.
     */
    DIRECT
}

package zhy2002.neutron;

/**
 * Indicates what the cycle is doing.
 */
public enum CycleStateEnum {

    /**
     * Applying changes.
     */
    Applying,
    /**
     * Reverting changes.
     */
    Reverting,
    /**
     * Firing rules.
     */
    Firing
}

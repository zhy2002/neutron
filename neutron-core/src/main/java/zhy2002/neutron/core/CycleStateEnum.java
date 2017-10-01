package zhy2002.neutron.core;

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

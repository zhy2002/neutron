package zhy2002.neutron;

/**
 * Indicates what the cycle is doing.
 */
public enum CycleStatusEnum {

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

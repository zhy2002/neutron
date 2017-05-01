package zhy2002.neutron;

/**
 * An interface used to observe the status of a cycle.
 * This contextual information can be used in rules.
 */
public interface CycleStatus {

    /**
     * The phase of the tick.
     * @return the phase.
     */
    TickPhase getCurrentPhase();

    /**
     * The current activation.
     * @return the binding activation.
     */
    BindingActivation getCurrentActivation();

    /**
     * Indicates what the cycle is doing.
     * @return status.
     */
    CycleStateEnum getCurrentStatus();

    /**
     * If is applying or reverting this is the event.
     * @return the event being applied or reverted.
     */
    ChangeUiNodeEvent getCurrentChangeEvent();

}

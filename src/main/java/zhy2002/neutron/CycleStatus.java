package zhy2002.neutron;

/**
 * An interface used to observe the status of a cycle.
 */
public interface CycleStatus {

    TickPhase getCurrentPhase();

    BindingActivation getCurrentActivation();

    CycleStatusEnum getCurrentStatus();

    ChangeUiNodeEvent getCurrentChangeEvent();

}

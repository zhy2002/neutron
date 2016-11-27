package zhy2002.neutron;

/**
 * An event that can only trigger post change rules.
 */
public class RefreshUiNodeEvent extends UiNodeEvent {

    protected RefreshUiNodeEvent(UiNode<?> target) {
        super(target);
    }

}

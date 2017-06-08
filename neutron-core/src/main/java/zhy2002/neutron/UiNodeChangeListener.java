package zhy2002.neutron;

/**
 * A callback implemented in JS.
 * onUiNodeChanged is called when
 * the state of a node is changed.
 * React component will then extract a state object
 * from the node to decide if re-render is necessary.
 */
public abstract class UiNodeChangeListener implements UiNodeNotificationListener {

    protected abstract void onUiNodeChanged();

    @Override
    public final void onNotify(Object parameter) {
        onUiNodeChanged();
    }
}

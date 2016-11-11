package zhy2002.neutron;

/**
 *
 */
public abstract class UiNodeContext<R extends UiNode<VoidUiNode>> {

    private R root;
    private int id = 0;

    public String getUniqueId() {
        return String.valueOf(id++); //todo this is a stub implementation
    }

    public R getRoot() {
        return this.root;
    }

    public void initialize(R root) {
        assert this.root == null;

        this.root = root;
    }

    public boolean isDirty() {
        return false;
    }

}

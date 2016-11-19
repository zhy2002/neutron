package zhy2002.examples.register;

import zhy2002.neutron.node.DefaultUiNodeStateKeys;
import zhy2002.neutron.node.atomic.StringUiNode;


public class EmailNode extends StringUiNode<RegisterNode> {

    protected EmailNode(RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void doLoad() {
        setStateValueInternal(DefaultUiNodeStateKeys.DISABLED, false);
    }

    @Override
    protected void doUnload() {

    }


}

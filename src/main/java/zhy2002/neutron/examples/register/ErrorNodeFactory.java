package zhy2002.neutron.examples.register;

import zhy2002.neutron.UiNodeFactory;

public class ErrorNodeFactory extends UiNodeFactory<ErrorNode, ErrorListNode> {

    @Override
    public ErrorNode create(ErrorListNode parent, String name) {
        ErrorNode errorNode = new ErrorNode(parent, name);
        parent.addChild(errorNode);
        return errorNode;
    }
}

package zhy2002.neutron.examples.register;

import zhy2002.neutron.UiNodeFactory;


public class ErrorListNodeFactory extends UiNodeFactory<ErrorListNode, RootNode> {
    @Override
    public ErrorListNode create(RootNode parent, String name) {

        ErrorListNode errorListNode = new ErrorListNode(parent, name);
        parent.setErrorList(errorListNode);
        return errorListNode;

    }
}

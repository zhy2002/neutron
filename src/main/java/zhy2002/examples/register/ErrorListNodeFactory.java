package zhy2002.examples.register;

import zhy2002.neutron.ChildNodeFactory;

public class ErrorListNodeFactory implements ChildNodeFactory<ErrorListNode, RegisterNode> {

    @Override
    public ErrorListNode create(RegisterNode parent, String name) {
        return new ErrorListNode(parent, name);
    }
}

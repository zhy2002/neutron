package zhy2002.examples.register;

import zhy2002.neutron.ChildNodeFactory;

public class ErrorNodeFactory extends ChildNodeFactory<ErrorNode, ErrorListNode> {
    @Override
    public ErrorNode create(ErrorListNode parent, String name) {
        return new ErrorNode(parent, name);
    }
}

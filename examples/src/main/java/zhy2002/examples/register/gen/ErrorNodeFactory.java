package zhy2002.examples.register.gen;

import zhy2002.neutron.ChildNodeFactory;

public class ErrorNodeFactory implements ChildNodeFactory<ErrorNode, ErrorListNode> {

    @Override
    public ErrorNode create(ErrorListNode parent, String name) {
        return new ErrorNode(parent, name);
    }

}

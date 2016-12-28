package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class ErrorListNodeFactory implements ChildNodeFactory<ErrorListNode, ApplicationNode> {

    @Override
    public ErrorListNode create(ApplicationNode parent, String name) {
        return new ErrorListNode(parent, name);
    }
}

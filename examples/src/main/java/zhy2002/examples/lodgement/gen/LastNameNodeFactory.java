package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class LastNameNodeFactory implements ChildNodeFactory<LastNameNode, PersonNode> {

    @Override
    public LastNameNode create(PersonNode parent, String name) {
        return new LastNameNode(parent, name);
    }
}

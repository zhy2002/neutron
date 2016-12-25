package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class FirstNameNodeFactory implements ChildNodeFactory<FirstNameNode, PersonNode> {

    @Override
    public FirstNameNode create(PersonNode parent, String name) {
        return new FirstNameNode(parent, name);
    }
}

package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class SpouseNodeFactory implements ChildNodeFactory<SpouseNode, PersonNode> {

    @Override
    public SpouseNode create(PersonNode parent, String name) {
        return new SpouseNode(parent, name);
    }
}

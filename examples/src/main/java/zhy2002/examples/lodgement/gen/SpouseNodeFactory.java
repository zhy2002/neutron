package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class SpouseNodeFactory implements ChildNodeFactory<SpouseNode, GeneralNode> {

    @Override
    public SpouseNode create(GeneralNode parent, String name) {
        return new SpouseNode(parent, name);
    }
}

package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class GenderNodeFactory implements ChildNodeFactory<GenderNode, PersonNode> {

    @Override
    public GenderNode create(PersonNode parent, String name) {
        return new GenderNode(parent, name);
    }
}

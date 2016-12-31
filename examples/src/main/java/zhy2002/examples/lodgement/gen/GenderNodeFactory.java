package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class GenderNodeFactory implements ChildNodeFactory<GenderNode, GeneralNode> {

    @Override
    public GenderNode create(GeneralNode parent, String name) {
        return new GenderNode(parent, name);
    }
}

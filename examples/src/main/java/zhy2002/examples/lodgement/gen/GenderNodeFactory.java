package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class GenderNodeFactory implements ChildNodeFactory<GenderNode, PersonGeneralNode> {

    @Override
    public GenderNode create(PersonGeneralNode parent, String name) {
        return new GenderNode(parent, name);
    }
}

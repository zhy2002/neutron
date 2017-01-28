package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class SpouseNodeFactory implements ChildNodeFactory<SpouseNode, PersonGeneralNode> {

    @Override
    public SpouseNode create(PersonGeneralNode parent, String name) {
        return new SpouseNode(parent, name);
    }
}

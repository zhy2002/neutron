package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class GeneralNodeFactory implements ChildNodeFactory<GeneralNode, PersonNode> {

    @Override
    public GeneralNode create(PersonNode parent, String name) {
        return new GeneralNode(parent, name);
    }
}

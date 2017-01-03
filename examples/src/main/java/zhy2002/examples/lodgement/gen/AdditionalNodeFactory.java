package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class AdditionalNodeFactory implements ChildNodeFactory<AdditionalNode, ApplicationNode> {

    @Override
    public AdditionalNode create(ApplicationNode parent, String name) {
        return new AdditionalNode(parent, name);
    }
}

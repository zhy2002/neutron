package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.ChildNodeFactory;

public class ApplicationTypeNodeFactory implements ChildNodeFactory<ApplicationTypeNode, PersonNode> {

    @Override
    public ApplicationTypeNode create(PersonNode parent, String name) {
        return new ApplicationTypeNode(parent, name);
    }
}

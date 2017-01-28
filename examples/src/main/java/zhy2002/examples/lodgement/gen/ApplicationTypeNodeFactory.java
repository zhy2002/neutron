package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ApplicationTypeNodeFactory implements ChildNodeFactory<ApplicationTypeNode, PersonGeneralNode> {

    @Override
    public ApplicationTypeNode create(PersonGeneralNode parent, String name) {
        return new ApplicationTypeNode(parent, name);
    }
}

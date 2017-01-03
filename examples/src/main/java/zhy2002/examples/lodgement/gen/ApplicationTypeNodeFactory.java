package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class ApplicationTypeNodeFactory implements ChildNodeFactory<ApplicationTypeNode, GeneralNode> {

    @Override
    public ApplicationTypeNode create(GeneralNode parent, String name) {
        return new ApplicationTypeNode(parent, name);
    }
}

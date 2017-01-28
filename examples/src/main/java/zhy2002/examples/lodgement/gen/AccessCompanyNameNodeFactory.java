package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class AccessCompanyNameNodeFactory implements ChildNodeFactory<AccessCompanyNameNode, AccessNode> {

    @Override
    public AccessCompanyNameNode create(AccessNode parent, String name) {
        return new AccessCompanyNameNode(parent, name);
    }
}

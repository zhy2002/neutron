package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class BusinessTypeNodeFactory implements ChildNodeFactory<BusinessTypeNode, SelfEmployedNode> {

    @Override
    public BusinessTypeNode create(SelfEmployedNode parent, String name) {
        return new BusinessTypeNode(parent, name);
    }
}

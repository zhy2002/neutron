package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class AccessOtherDescriptionNodeFactory implements ChildNodeFactory<AccessOtherDescriptionNode, AccessNode> {

    @Override
    public AccessOtherDescriptionNode create(AccessNode parent, String name) {
        return new AccessOtherDescriptionNode(parent, name);
    }
}

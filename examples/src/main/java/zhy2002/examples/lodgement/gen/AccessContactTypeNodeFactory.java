package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class AccessContactTypeNodeFactory implements ChildNodeFactory<AccessContactTypeNode, AccessNode> {

    @Override
    public AccessContactTypeNode create(AccessNode parent, String name) {
        return new AccessContactTypeNode(parent, name);
    }
}

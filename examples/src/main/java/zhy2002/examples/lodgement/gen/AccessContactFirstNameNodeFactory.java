package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class AccessContactFirstNameNodeFactory implements ChildNodeFactory<AccessContactFirstNameNode, AccessNode> {

    @Override
    public AccessContactFirstNameNode create(AccessNode parent, String name) {
        return new AccessContactFirstNameNode(parent, name);
    }
}

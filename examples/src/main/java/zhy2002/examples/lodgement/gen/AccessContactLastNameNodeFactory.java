package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class AccessContactLastNameNodeFactory implements ChildNodeFactory<AccessContactLastNameNode, AccessNode> {

    @Override
    public AccessContactLastNameNode create(AccessNode parent, String name) {
        return new AccessContactLastNameNode(parent, name);
    }
}

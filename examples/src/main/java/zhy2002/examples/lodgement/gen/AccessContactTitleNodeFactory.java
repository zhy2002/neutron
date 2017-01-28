package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class AccessContactTitleNodeFactory implements ChildNodeFactory<AccessContactTitleNode, AccessNode> {

    @Override
    public AccessContactTitleNode create(AccessNode parent, String name) {
        return new AccessContactTitleNode(parent, name);
    }
}

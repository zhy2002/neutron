package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class UnemployedSinceNodeFactory implements ChildNodeFactory<UnemployedSinceNode, UnemployedNode> {

    @Override
    public UnemployedSinceNode create(UnemployedNode parent, String name) {
        return new UnemployedSinceNode(parent, name);
    }
}

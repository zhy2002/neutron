package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class HouseDutiesFlagNodeFactory implements ChildNodeFactory<HouseDutiesFlagNode, UnemployedNode> {

    @Override
    public HouseDutiesFlagNode create(UnemployedNode parent, String name) {
        return new HouseDutiesFlagNode(parent, name);
    }
}

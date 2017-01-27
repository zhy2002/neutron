package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class SelfEmployedNodeFactory implements ChildNodeFactory<SelfEmployedNode, EmploymentNode<?>> {

    @Override
    public SelfEmployedNode create(EmploymentNode parent, String name) {
        return new SelfEmployedNode(parent, name);
    }
}

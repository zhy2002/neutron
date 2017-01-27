package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class PayeEmployedNodeFactory implements ChildNodeFactory<PayeEmployedNode, EmploymentNode<?>> {

    @Override
    public PayeEmployedNode create(EmploymentNode parent, String name) {
        return new PayeEmployedNode(parent, name);
    }
}

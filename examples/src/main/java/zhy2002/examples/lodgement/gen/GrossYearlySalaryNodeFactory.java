package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class GrossYearlySalaryNodeFactory implements ChildNodeFactory<GrossYearlySalaryNode, PayeEmployedNode> {

    @Override
    public GrossYearlySalaryNode create(PayeEmployedNode parent, String name) {
        return new GrossYearlySalaryNode(parent, name);
    }
}

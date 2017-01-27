package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class EmployerAddressNodeFactory implements ChildNodeFactory<EmployerAddressNode, EmployedNode> {

    @Override
    public EmployerAddressNode create(EmployedNode parent, String name) {
        return new EmployerAddressNode(parent, name);
    }
}

package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class EmployerPhoneNodeFactory implements ChildNodeFactory<EmployerPhoneNode, EmployedNode> {

    @Override
    public EmployerPhoneNode create(EmployedNode parent, String name) {
        return new EmployerPhoneNode(parent, name);
    }
}

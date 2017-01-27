package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class EmployerNameNodeFactory implements ChildNodeFactory<EmployerNameNode, EmployedNode> {

    @Override
    public EmployerNameNode create(EmployedNode parent, String name) {
        return new EmployerNameNode(parent, name);
    }
}

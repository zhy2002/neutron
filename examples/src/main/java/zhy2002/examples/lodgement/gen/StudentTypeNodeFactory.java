package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class StudentTypeNodeFactory implements ChildNodeFactory<StudentTypeNode, UnemployedNode> {

    @Override
    public StudentTypeNode create(UnemployedNode parent, String name) {
        return new StudentTypeNode(parent, name);
    }
}

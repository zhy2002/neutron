package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class StudentFlagNodeFactory implements ChildNodeFactory<StudentFlagNode, UnemployedNode> {

    @Override
    public StudentFlagNode create(UnemployedNode parent, String name) {
        return new StudentFlagNode(parent, name);
    }
}

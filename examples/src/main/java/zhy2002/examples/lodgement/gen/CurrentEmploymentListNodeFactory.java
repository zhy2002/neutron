package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class CurrentEmploymentListNodeFactory implements ChildNodeFactory<CurrentEmploymentListNode, PersonNode> {

    @Override
    public CurrentEmploymentListNode create(PersonNode parent, String name) {
        return new CurrentEmploymentListNode(parent, name);
    }
}

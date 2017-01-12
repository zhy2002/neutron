package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class CurrentEmploymentNodeFactory implements ChildNodeFactory<CurrentEmploymentNode, CurrentEmploymentListNode> {

    @Override
    public CurrentEmploymentNode create(CurrentEmploymentListNode parent, String name) {
        return new CurrentEmploymentNode(parent, name);
    }
}

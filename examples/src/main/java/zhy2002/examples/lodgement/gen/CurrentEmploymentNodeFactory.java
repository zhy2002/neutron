package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class CurrentEmploymentNodeFactory implements ChildNodeFactory<CurrentEmploymentNode, PersonNode> {

    @Override
    public CurrentEmploymentNode create(PersonNode parent, String name) {
        return new CurrentEmploymentNode(parent, name);
    }
}

package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class RetiredEmploymentNodeFactory implements ChildNodeFactory<RetiredEmploymentNode, EmploymentNode<?>> {

    @Override
    public RetiredEmploymentNode create(EmploymentNode<?> parent, String name) {
        return new RetiredEmploymentNode(parent, name);
    }
}

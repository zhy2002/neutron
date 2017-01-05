package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class MonthNodeFactory implements ChildNodeFactory<MonthNode, MonthYearNode<?>> {

    @Override
    public MonthNode create(MonthYearNode<?> parent, String name) {
        return new MonthNode(parent, name);
    }
}

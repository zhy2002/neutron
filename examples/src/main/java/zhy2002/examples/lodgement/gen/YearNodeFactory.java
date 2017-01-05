package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;

public class YearNodeFactory implements ChildNodeFactory<YearNode, MonthYearNode<?>> {

    @Override
    public YearNode create(MonthYearNode<?> parent, String name) {
        return new YearNode(parent, name);
    }
}

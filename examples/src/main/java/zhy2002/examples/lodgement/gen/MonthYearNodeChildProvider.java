package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface MonthYearNodeChildFactory {
    MonthNode createMonthNode();
    YearNode createYearNode();
}

@Singleton
public class MonthYearNodeChildProvider {
    @Inject
    MembersInjector<MonthNode> monthNodeInjector;
    @Inject
    MembersInjector<YearNode> yearNodeInjector;

    @Inject
    protected MonthYearNodeChildProvider () {}

    protected MembersInjector<MonthNode> getMonthNodeInjector() {
        return this.monthNodeInjector;
    }

    protected MembersInjector<YearNode> getYearNodeInjector() {
        return this.yearNodeInjector;
    }

    protected MonthNode newMonthNode(
        MonthYearNode<?> parent,
        String name
    ) {
        return new MonthNode(parent, name);
    }

    protected YearNode newYearNode(
        MonthYearNode<?> parent,
        String name
    ) {
        return new YearNode(parent, name);
    }

    MonthYearNodeChildFactory createFactory(MonthYearNode<?> parent) {
        return new MonthYearNodeChildFactoryImpl(parent);
    }

    private class MonthYearNodeChildFactoryImpl implements MonthYearNodeChildFactory {

        private final MonthYearNode<?> parent;
        
        private MonthYearNodeChildFactoryImpl(MonthYearNode<?> parent) {
            this.parent = parent;
        }

        @Override
        public MonthNode createMonthNode() {
            MonthNode node = newMonthNode(parent, "monthNode");
            monthNodeInjector.injectMembers(node);
            return node;
        }

        @Override
        public YearNode createYearNode() {
            YearNode node = newYearNode(parent, "yearNode");
            yearNodeInjector.injectMembers(node);
            return node;
        }

    }
}

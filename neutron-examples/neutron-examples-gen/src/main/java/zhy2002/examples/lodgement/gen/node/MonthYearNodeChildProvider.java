package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


interface MonthYearNodeChildFactory {
    MonthNode createMonthNode();
    YearNode createYearNode();
}

@Singleton
public class MonthYearNodeChildProvider {
    @Inject
    MembersInjector<YearNode> yearNodeInjector;
    @Inject
    MembersInjector<MonthNode> monthNodeInjector;

    @Inject
    protected MonthYearNodeChildProvider () {}

    protected MembersInjector<YearNode> getYearNodeInjector() {
        return this.yearNodeInjector;
    }

    protected MembersInjector<MonthNode> getMonthNodeInjector() {
        return this.monthNodeInjector;
    }

    protected MonthNode newMonthNode(
        MonthYearNode<?> parent,
        String name
    ) {
        return new MonthNode(parent, name);
    }

    protected void configureMonthNode(MonthNode node) {
    }

    @ComponentScope
    public static class MonthNodeRuleProvider implements RuleProvider<MonthNode> {

        @Inject
        public MonthNodeRuleProvider() {

        }

        @Override
        public void initializeState(MonthNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected YearNode newYearNode(
        MonthYearNode<?> parent,
        String name
    ) {
        return new YearNode(parent, name);
    }

    protected void configureYearNode(YearNode node) {
    }

    @ComponentScope
    public static class YearNodeRuleProvider implements RuleProvider<YearNode> {

        @Inject
        public YearNodeRuleProvider() {

        }

        @Override
        public void initializeState(YearNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
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
            configureMonthNode(node);
            return node;
        }

        @Override
        public YearNode createYearNode() {
            YearNode node = newYearNode(parent, "yearNode");
            yearNodeInjector.injectMembers(node);
            configureYearNode(node);
            return node;
        }

    }
}

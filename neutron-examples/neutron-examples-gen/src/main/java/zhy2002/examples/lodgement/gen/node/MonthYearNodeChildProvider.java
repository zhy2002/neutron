package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class MonthYearNodeChildProvider {


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

}

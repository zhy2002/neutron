package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class AssetsNodeChildProvider {


    @ComponentScope
    public static class SavingsAccountListNodeRuleProvider implements RuleProvider<SavingsAccountListNode> {

        @Inject
        public SavingsAccountListNodeRuleProvider() {

        }

        @Override
        public void initializeState(SavingsAccountListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class MotorVehicleListNodeRuleProvider implements RuleProvider<MotorVehicleListNode> {

        @Inject
        public MotorVehicleListNodeRuleProvider() {

        }

        @Override
        public void initializeState(MotorVehicleListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class OtherAssetListNodeRuleProvider implements RuleProvider<OtherAssetListNode> {

        @Inject
        public OtherAssetListNodeRuleProvider() {

        }

        @Override
        public void initializeState(OtherAssetListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}

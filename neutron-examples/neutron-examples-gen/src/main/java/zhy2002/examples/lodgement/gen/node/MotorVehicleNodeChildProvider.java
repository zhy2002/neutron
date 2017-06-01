package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class MotorVehicleNodeChildProvider {


    @ComponentScope
    public static class VehicleModelNodeRuleProvider implements RuleProvider<VehicleModelNode> {

        @Inject
        public VehicleModelNodeRuleProvider() {

        }

        @Override
        public void initializeState(VehicleModelNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class VehicleYearNodeRuleProvider implements RuleProvider<VehicleYearNode> {

        @Inject
        public VehicleYearNodeRuleProvider() {

        }

        @Override
        public void initializeState(VehicleYearNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class VehicleMarketValueNodeRuleProvider implements RuleProvider<VehicleMarketValueNode> {

        @Inject
        public VehicleMarketValueNodeRuleProvider() {

        }

        @Override
        public void initializeState(VehicleMarketValueNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class OwnershipListNodeRuleProvider implements RuleProvider<VehicleOwnershipListNode> {

        @Inject
        public OwnershipListNodeRuleProvider() {

        }

        @Override
        public void initializeState(VehicleOwnershipListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}

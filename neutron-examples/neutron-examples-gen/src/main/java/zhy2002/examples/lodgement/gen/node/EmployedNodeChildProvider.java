package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class EmployedNodeChildProvider {


    @ComponentScope
    public static class EmploymentStatusNodeRuleProvider implements RuleProvider<EmploymentStatusNode> {

        @Inject
        public EmploymentStatusNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmploymentStatusNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class OccupationNodeRuleProvider implements RuleProvider<OccupationNode> {

        @Inject
        public OccupationNodeRuleProvider() {

        }

        @Override
        public void initializeState(OccupationNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class EmployerNameNodeRuleProvider implements RuleProvider<EmployerNameNode> {

        @Inject
        public EmployerNameNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmployerNameNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class EmployerAddressNodeRuleProvider implements RuleProvider<EmployerAddressNode> {

        @Inject
        public EmployerAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmployerAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class EmployerPhoneNodeRuleProvider implements RuleProvider<EmployerPhoneNode> {

        @Inject
        public EmployerPhoneNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmployerPhoneNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class EmploymentStartedNodeRuleProvider implements RuleProvider<EmploymentStartedNode> {

        @Inject
        public EmploymentStartedNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmploymentStartedNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class EmploymentEndedNodeRuleProvider implements RuleProvider<EmploymentEndedNode> {

        @Inject
        public EmploymentEndedNodeRuleProvider() {

        }

        @Override
        public void initializeState(EmploymentEndedNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}

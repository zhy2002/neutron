package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


public class PersonContactNodeChildProvider {


    @ComponentScope
    public static class HomePhoneNodeRuleProvider implements RuleProvider<PersonTelephoneNode> {

        @Inject
        public HomePhoneNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonTelephoneNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class WorkPhoneNodeRuleProvider implements RuleProvider<PersonTelephoneNode> {

        @Inject
        public WorkPhoneNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonTelephoneNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class FaxNumberNodeRuleProvider implements RuleProvider<PersonTelephoneNode> {

        @Inject
        public FaxNumberNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonTelephoneNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class PersonMobileNumberNodeRuleProvider implements RuleProvider<PersonMobileNumberNode> {

        @Inject
        public PersonMobileNumberNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonMobileNumberNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class PersonEmailNodeRuleProvider implements RuleProvider<PersonEmailNode> {

        @Inject
        public PersonEmailNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonEmailNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class CurrentAddressNodeRuleProvider implements RuleProvider<PersonAddressNode> {

        @Inject
        public CurrentAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class MovedToCurrentAddressNodeRuleProvider implements RuleProvider<MovedToCurrentAddressNode> {

        @Inject
        public MovedToCurrentAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(MovedToCurrentAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class PostalAddressNodeRuleProvider implements RuleProvider<PersonAddressNode> {

        @Inject
        public PostalAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class PreviousAddressNodeRuleProvider implements RuleProvider<PersonAddressNode> {

        @Inject
        public PreviousAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class MovedToPreviousAddressNodeRuleProvider implements RuleProvider<MovedToPreviousAddressNode> {

        @Inject
        public MovedToPreviousAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(MovedToPreviousAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }


    @ComponentScope
    public static class MovedFromPreviousAddressNodeRuleProvider implements RuleProvider<MovedFromPreviousAddressNode> {

        @Inject
        public MovedFromPreviousAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(MovedFromPreviousAddressNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

}

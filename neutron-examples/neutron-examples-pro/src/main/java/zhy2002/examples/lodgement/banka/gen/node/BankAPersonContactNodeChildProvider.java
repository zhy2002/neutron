package zhy2002.examples.lodgement.banka.gen.node;
/* template name: profile_child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


public class BankAPersonContactNodeChildProvider {

    @PersonTelephoneNodeScope
    public static class HomePhoneNodeRuleProvider extends PersonContactNodeChildProvider.HomePhoneNodeRuleProvider {

        @Inject
        public HomePhoneNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonTelephoneNode node) {
            super.initializeState(node);

        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
            super.createRules(createdRules);
        }
    }


    @PersonTelephoneNodeScope
    public static class WorkPhoneNodeRuleProvider extends PersonContactNodeChildProvider.WorkPhoneNodeRuleProvider {

        @Inject
        public WorkPhoneNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonTelephoneNode node) {
            super.initializeState(node);

        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
            super.createRules(createdRules);
        }
    }


    @PersonTelephoneNodeScope
    public static class FaxNumberNodeRuleProvider extends PersonContactNodeChildProvider.FaxNumberNodeRuleProvider {

        @Inject
        public FaxNumberNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonTelephoneNode node) {
            super.initializeState(node);

        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
            super.createRules(createdRules);
        }
    }


    @PersonMobileNumberNodeScope
    public static class PersonMobileNumberNodeRuleProvider extends PersonContactNodeChildProvider.PersonMobileNumberNodeRuleProvider {

        @Inject
        public PersonMobileNumberNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonMobileNumberNode node) {
            super.initializeState(node);

        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
            super.createRules(createdRules);
        }
    }


    @PersonEmailNodeScope
    public static class PersonEmailNodeRuleProvider extends PersonContactNodeChildProvider.PersonEmailNodeRuleProvider {

        @Inject
        public PersonEmailNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonEmailNode node) {
            super.initializeState(node);

        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
            super.createRules(createdRules);
        }
    }


    @PersonAddressNodeScope
    public static class CurrentAddressNodeRuleProvider extends PersonContactNodeChildProvider.CurrentAddressNodeRuleProvider {

        @Inject
        public CurrentAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonAddressNode node) {
            super.initializeState(node);

            node.setRequired(true);
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
            super.createRules(createdRules);
        }
    }


    @MovedToCurrentAddressNodeScope
    public static class MovedToCurrentAddressNodeRuleProvider extends PersonContactNodeChildProvider.MovedToCurrentAddressNodeRuleProvider {

        @Inject
        public MovedToCurrentAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(MovedToCurrentAddressNode node) {
            super.initializeState(node);

        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
            super.createRules(createdRules);
        }
    }


    @PersonAddressNodeScope
    public static class PostalAddressNodeRuleProvider extends PersonContactNodeChildProvider.PostalAddressNodeRuleProvider {

        @Inject
        public PostalAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonAddressNode node) {
            super.initializeState(node);

        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
            super.createRules(createdRules);
        }
    }


    @PersonAddressNodeScope
    public static class PreviousAddressNodeRuleProvider extends PersonContactNodeChildProvider.PreviousAddressNodeRuleProvider {

        @Inject
        public PreviousAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonAddressNode node) {
            super.initializeState(node);

        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
            super.createRules(createdRules);
        }
    }


    @MovedToPreviousAddressNodeScope
    public static class MovedToPreviousAddressNodeRuleProvider extends PersonContactNodeChildProvider.MovedToPreviousAddressNodeRuleProvider {

        @Inject
        public MovedToPreviousAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(MovedToPreviousAddressNode node) {
            super.initializeState(node);

        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
            super.createRules(createdRules);
        }
    }


    @MovedFromPreviousAddressNodeScope
    public static class MovedFromPreviousAddressNodeRuleProvider extends PersonContactNodeChildProvider.MovedFromPreviousAddressNodeRuleProvider {

        @Inject
        public MovedFromPreviousAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(MovedFromPreviousAddressNode node) {
            super.initializeState(node);

        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
            super.createRules(createdRules);
        }
    }

}

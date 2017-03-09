package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;


interface PersonContactNodeChildFactory {
    PersonTelephoneNode createHomePhoneNode();
    PersonTelephoneNode createWorkPhoneNode();
    PersonTelephoneNode createFaxNumberNode();
    PersonMobileNumberNode createPersonMobileNumberNode();
    PersonEmailNode createPersonEmailNode();
    PersonAddressNode createCurrentAddressNode();
    MovedToCurrentAddressNode createMovedToCurrentAddressNode();
    PersonAddressNode createPostalAddressNode();
    PersonAddressNode createPreviousAddressNode();
    MovedToPreviousAddressNode createMovedToPreviousAddressNode();
    MovedFromPreviousAddressNode createMovedFromPreviousAddressNode();
}

@Singleton
public class PersonContactNodeChildProvider {
    @Inject
    MembersInjector<MovedFromPreviousAddressNode> movedFromPreviousAddressNodeInjector;
    @Inject
    MembersInjector<PersonTelephoneNode> personTelephoneNodeInjector;
    @Inject
    MembersInjector<PersonEmailNode> personEmailNodeInjector;
    @Inject
    MembersInjector<PersonMobileNumberNode> personMobileNumberNodeInjector;
    @Inject
    MembersInjector<PersonAddressNode> personAddressNodeInjector;
    @Inject
    MembersInjector<MovedToPreviousAddressNode> movedToPreviousAddressNodeInjector;
    @Inject
    MembersInjector<MovedToCurrentAddressNode> movedToCurrentAddressNodeInjector;

    @Inject
    protected PersonContactNodeChildProvider () {}

    protected MembersInjector<MovedFromPreviousAddressNode> getMovedFromPreviousAddressNodeInjector() {
        return this.movedFromPreviousAddressNodeInjector;
    }

    protected MembersInjector<PersonTelephoneNode> getPersonTelephoneNodeInjector() {
        return this.personTelephoneNodeInjector;
    }

    protected MembersInjector<PersonEmailNode> getPersonEmailNodeInjector() {
        return this.personEmailNodeInjector;
    }

    protected MembersInjector<PersonMobileNumberNode> getPersonMobileNumberNodeInjector() {
        return this.personMobileNumberNodeInjector;
    }

    protected MembersInjector<PersonAddressNode> getPersonAddressNodeInjector() {
        return this.personAddressNodeInjector;
    }

    protected MembersInjector<MovedToPreviousAddressNode> getMovedToPreviousAddressNodeInjector() {
        return this.movedToPreviousAddressNodeInjector;
    }

    protected MembersInjector<MovedToCurrentAddressNode> getMovedToCurrentAddressNodeInjector() {
        return this.movedToCurrentAddressNodeInjector;
    }

    protected PersonTelephoneNode newHomePhoneNode(
        PersonContactNode parent,
        String name
    ) {
        return new PersonTelephoneNode(parent, name);
    }

    protected void configureHomePhoneNode(PersonTelephoneNode node) {
    }

    @PersonTelephoneNodeScope
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

    protected PersonTelephoneNode newWorkPhoneNode(
        PersonContactNode parent,
        String name
    ) {
        return new PersonTelephoneNode(parent, name);
    }

    protected void configureWorkPhoneNode(PersonTelephoneNode node) {
    }

    @PersonTelephoneNodeScope
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

    protected PersonTelephoneNode newFaxNumberNode(
        PersonContactNode parent,
        String name
    ) {
        return new PersonTelephoneNode(parent, name);
    }

    protected void configureFaxNumberNode(PersonTelephoneNode node) {
    }

    @PersonTelephoneNodeScope
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

    protected PersonMobileNumberNode newPersonMobileNumberNode(
        PersonContactNode parent,
        String name
    ) {
        return new PersonMobileNumberNode(parent, name);
    }

    protected void configurePersonMobileNumberNode(PersonMobileNumberNode node) {
    }

    @PersonMobileNumberNodeScope
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

    protected PersonEmailNode newPersonEmailNode(
        PersonContactNode parent,
        String name
    ) {
        return new PersonEmailNode(parent, name);
    }

    protected void configurePersonEmailNode(PersonEmailNode node) {
    }

    @PersonEmailNodeScope
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

    protected PersonAddressNode newCurrentAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new PersonAddressNode(parent, name);
    }

    protected void configureCurrentAddressNode(PersonAddressNode node) {
    }

    @PersonAddressNodeScope
    public static class CurrentAddressNodeRuleProvider implements RuleProvider<PersonAddressNode> {

        @Inject
        public CurrentAddressNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonAddressNode node) {
            node.setRequired(true);
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected MovedToCurrentAddressNode newMovedToCurrentAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new MovedToCurrentAddressNode(parent, name);
    }

    protected void configureMovedToCurrentAddressNode(MovedToCurrentAddressNode node) {
    }

    @MovedToCurrentAddressNodeScope
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

    protected PersonAddressNode newPostalAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new PersonAddressNode(parent, name);
    }

    protected void configurePostalAddressNode(PersonAddressNode node) {
    }

    @PersonAddressNodeScope
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

    protected PersonAddressNode newPreviousAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new PersonAddressNode(parent, name);
    }

    protected void configurePreviousAddressNode(PersonAddressNode node) {
    }

    @PersonAddressNodeScope
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

    protected MovedToPreviousAddressNode newMovedToPreviousAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new MovedToPreviousAddressNode(parent, name);
    }

    protected void configureMovedToPreviousAddressNode(MovedToPreviousAddressNode node) {
    }

    @MovedToPreviousAddressNodeScope
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

    protected MovedFromPreviousAddressNode newMovedFromPreviousAddressNode(
        PersonContactNode parent,
        String name
    ) {
        return new MovedFromPreviousAddressNode(parent, name);
    }

    protected void configureMovedFromPreviousAddressNode(MovedFromPreviousAddressNode node) {
    }

    @MovedFromPreviousAddressNodeScope
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

    PersonContactNodeChildFactory createFactory(PersonContactNode parent) {
        return new PersonContactNodeChildFactoryImpl(parent);
    }

    private class PersonContactNodeChildFactoryImpl implements PersonContactNodeChildFactory {

        private final PersonContactNode parent;
        
        private PersonContactNodeChildFactoryImpl(PersonContactNode parent) {
            this.parent = parent;
        }

        @Override
        public PersonTelephoneNode createHomePhoneNode() {
            PersonTelephoneNode node = newHomePhoneNode(parent, "homePhoneNode");
            personTelephoneNodeInjector.injectMembers(node);
            configureHomePhoneNode(node);
            return node;
        }

        @Override
        public PersonTelephoneNode createWorkPhoneNode() {
            PersonTelephoneNode node = newWorkPhoneNode(parent, "workPhoneNode");
            personTelephoneNodeInjector.injectMembers(node);
            configureWorkPhoneNode(node);
            return node;
        }

        @Override
        public PersonTelephoneNode createFaxNumberNode() {
            PersonTelephoneNode node = newFaxNumberNode(parent, "faxNumberNode");
            personTelephoneNodeInjector.injectMembers(node);
            configureFaxNumberNode(node);
            return node;
        }

        @Override
        public PersonMobileNumberNode createPersonMobileNumberNode() {
            PersonMobileNumberNode node = newPersonMobileNumberNode(parent, "personMobileNumberNode");
            personMobileNumberNodeInjector.injectMembers(node);
            configurePersonMobileNumberNode(node);
            return node;
        }

        @Override
        public PersonEmailNode createPersonEmailNode() {
            PersonEmailNode node = newPersonEmailNode(parent, "personEmailNode");
            personEmailNodeInjector.injectMembers(node);
            configurePersonEmailNode(node);
            return node;
        }

        @Override
        public PersonAddressNode createCurrentAddressNode() {
            PersonAddressNode node = newCurrentAddressNode(parent, "currentAddressNode");
            personAddressNodeInjector.injectMembers(node);
            configureCurrentAddressNode(node);
            return node;
        }

        @Override
        public MovedToCurrentAddressNode createMovedToCurrentAddressNode() {
            MovedToCurrentAddressNode node = newMovedToCurrentAddressNode(parent, "movedToCurrentAddressNode");
            movedToCurrentAddressNodeInjector.injectMembers(node);
            configureMovedToCurrentAddressNode(node);
            return node;
        }

        @Override
        public PersonAddressNode createPostalAddressNode() {
            PersonAddressNode node = newPostalAddressNode(parent, "postalAddressNode");
            personAddressNodeInjector.injectMembers(node);
            configurePostalAddressNode(node);
            return node;
        }

        @Override
        public PersonAddressNode createPreviousAddressNode() {
            PersonAddressNode node = newPreviousAddressNode(parent, "previousAddressNode");
            personAddressNodeInjector.injectMembers(node);
            configurePreviousAddressNode(node);
            return node;
        }

        @Override
        public MovedToPreviousAddressNode createMovedToPreviousAddressNode() {
            MovedToPreviousAddressNode node = newMovedToPreviousAddressNode(parent, "movedToPreviousAddressNode");
            movedToPreviousAddressNodeInjector.injectMembers(node);
            configureMovedToPreviousAddressNode(node);
            return node;
        }

        @Override
        public MovedFromPreviousAddressNode createMovedFromPreviousAddressNode() {
            MovedFromPreviousAddressNode node = newMovedFromPreviousAddressNode(parent, "movedFromPreviousAddressNode");
            movedFromPreviousAddressNodeInjector.injectMembers(node);
            configureMovedFromPreviousAddressNode(node);
            return node;
        }

    }
}

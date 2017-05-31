package zhy2002.examples.lodgement.gen.node;
/* template name: child_factory.ftl */
import zhy2002.neutron.*;
import dagger.MembersInjector;
import javax.inject.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.*;
import zhy2002.neutron.di.ComponentScope;


interface PersonNodeChildFactory {
    PersonGeneralNode createPersonGeneralNode();
    PersonContactNode createPersonContactNode();
    CurrentEmploymentListNode createCurrentEmploymentListNode();
    PreviousEmploymentListNode createPreviousEmploymentListNode();
    PersonTrustNode createPersonTrustNode();
    PersonPrivacyNode createPersonPrivacyNode();
    PersonOtherIncomeListNode createPersonOtherIncomeListNode();
    PersonResponsibleLendNode createPersonResponsibleLendNode();
}

@Singleton
public class PersonNodeChildProvider {
    @Inject
    MembersInjector<PersonGeneralNode> personGeneralNodeInjector;
    @Inject
    MembersInjector<PersonOtherIncomeListNode> personOtherIncomeListNodeInjector;
    @Inject
    MembersInjector<PersonResponsibleLendNode> personResponsibleLendNodeInjector;
    @Inject
    MembersInjector<CurrentEmploymentListNode> currentEmploymentListNodeInjector;
    @Inject
    MembersInjector<PersonPrivacyNode> personPrivacyNodeInjector;
    @Inject
    MembersInjector<PersonContactNode> personContactNodeInjector;
    @Inject
    MembersInjector<PreviousEmploymentListNode> previousEmploymentListNodeInjector;
    @Inject
    MembersInjector<PersonTrustNode> personTrustNodeInjector;

    @Inject
    protected PersonNodeChildProvider () {}

    protected MembersInjector<PersonGeneralNode> getPersonGeneralNodeInjector() {
        return this.personGeneralNodeInjector;
    }

    protected MembersInjector<PersonOtherIncomeListNode> getPersonOtherIncomeListNodeInjector() {
        return this.personOtherIncomeListNodeInjector;
    }

    protected MembersInjector<PersonResponsibleLendNode> getPersonResponsibleLendNodeInjector() {
        return this.personResponsibleLendNodeInjector;
    }

    protected MembersInjector<CurrentEmploymentListNode> getCurrentEmploymentListNodeInjector() {
        return this.currentEmploymentListNodeInjector;
    }

    protected MembersInjector<PersonPrivacyNode> getPersonPrivacyNodeInjector() {
        return this.personPrivacyNodeInjector;
    }

    protected MembersInjector<PersonContactNode> getPersonContactNodeInjector() {
        return this.personContactNodeInjector;
    }

    protected MembersInjector<PreviousEmploymentListNode> getPreviousEmploymentListNodeInjector() {
        return this.previousEmploymentListNodeInjector;
    }

    protected MembersInjector<PersonTrustNode> getPersonTrustNodeInjector() {
        return this.personTrustNodeInjector;
    }

    protected PersonGeneralNode newPersonGeneralNode(
        PersonNode parent,
        String name
    ) {
        return new PersonGeneralNode(parent, name);
    }

    protected void configurePersonGeneralNode(PersonGeneralNode node) {
    }

    @ComponentScope
    public static class PersonGeneralNodeRuleProvider implements RuleProvider<PersonGeneralNode> {

        @Inject
        public PersonGeneralNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonGeneralNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PersonContactNode newPersonContactNode(
        PersonNode parent,
        String name
    ) {
        return new PersonContactNode(parent, name);
    }

    protected void configurePersonContactNode(PersonContactNode node) {
    }

    @ComponentScope
    public static class PersonContactNodeRuleProvider implements RuleProvider<PersonContactNode> {

        @Inject
        public PersonContactNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonContactNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected CurrentEmploymentListNode newCurrentEmploymentListNode(
        PersonNode parent,
        String name
    ) {
        return new CurrentEmploymentListNode(parent, name);
    }

    protected void configureCurrentEmploymentListNode(CurrentEmploymentListNode node) {
    }

    @ComponentScope
    public static class CurrentEmploymentListNodeRuleProvider implements RuleProvider<CurrentEmploymentListNode> {

        @Inject
        public CurrentEmploymentListNodeRuleProvider() {

        }

        @Override
        public void initializeState(CurrentEmploymentListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PreviousEmploymentListNode newPreviousEmploymentListNode(
        PersonNode parent,
        String name
    ) {
        return new PreviousEmploymentListNode(parent, name);
    }

    protected void configurePreviousEmploymentListNode(PreviousEmploymentListNode node) {
    }

    @ComponentScope
    public static class PreviousEmploymentListNodeRuleProvider implements RuleProvider<PreviousEmploymentListNode> {

        @Inject
        public PreviousEmploymentListNodeRuleProvider() {

        }

        @Override
        public void initializeState(PreviousEmploymentListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PersonTrustNode newPersonTrustNode(
        PersonNode parent,
        String name
    ) {
        return new PersonTrustNode(parent, name);
    }

    protected void configurePersonTrustNode(PersonTrustNode node) {
    }

    @ComponentScope
    public static class PersonTrustNodeRuleProvider implements RuleProvider<PersonTrustNode> {

        @Inject
        public PersonTrustNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonTrustNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PersonPrivacyNode newPersonPrivacyNode(
        PersonNode parent,
        String name
    ) {
        return new PersonPrivacyNode(parent, name);
    }

    protected void configurePersonPrivacyNode(PersonPrivacyNode node) {
    }

    @ComponentScope
    public static class PersonPrivacyNodeRuleProvider implements RuleProvider<PersonPrivacyNode> {

        @Inject
        public PersonPrivacyNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonPrivacyNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PersonOtherIncomeListNode newPersonOtherIncomeListNode(
        PersonNode parent,
        String name
    ) {
        return new PersonOtherIncomeListNode(parent, name);
    }

    protected void configurePersonOtherIncomeListNode(PersonOtherIncomeListNode node) {
    }

    @ComponentScope
    public static class PersonOtherIncomeListNodeRuleProvider implements RuleProvider<PersonOtherIncomeListNode> {

        @Inject
        public PersonOtherIncomeListNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonOtherIncomeListNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    protected PersonResponsibleLendNode newPersonResponsibleLendNode(
        PersonNode parent,
        String name
    ) {
        return new PersonResponsibleLendNode(parent, name);
    }

    protected void configurePersonResponsibleLendNode(PersonResponsibleLendNode node) {
    }

    @ComponentScope
    public static class PersonResponsibleLendNodeRuleProvider implements RuleProvider<PersonResponsibleLendNode> {

        @Inject
        public PersonResponsibleLendNodeRuleProvider() {

        }

        @Override
        public void initializeState(PersonResponsibleLendNode node) {
        }


        @Override
        public void createRules(List<UiNodeRule<?>> createdRules) {
        }
    }

    PersonNodeChildFactory createFactory(PersonNode parent) {
        return new PersonNodeChildFactoryImpl(parent);
    }

    private class PersonNodeChildFactoryImpl implements PersonNodeChildFactory {

        private final PersonNode parent;
        
        private PersonNodeChildFactoryImpl(PersonNode parent) {
            this.parent = parent;
        }

        @Override
        public PersonGeneralNode createPersonGeneralNode() {
            PersonGeneralNode node = newPersonGeneralNode(parent, "personGeneralNode");
            personGeneralNodeInjector.injectMembers(node);
            configurePersonGeneralNode(node);
            return node;
        }

        @Override
        public PersonContactNode createPersonContactNode() {
            PersonContactNode node = newPersonContactNode(parent, "personContactNode");
            personContactNodeInjector.injectMembers(node);
            configurePersonContactNode(node);
            return node;
        }

        @Override
        public CurrentEmploymentListNode createCurrentEmploymentListNode() {
            CurrentEmploymentListNode node = newCurrentEmploymentListNode(parent, "currentEmploymentListNode");
            currentEmploymentListNodeInjector.injectMembers(node);
            configureCurrentEmploymentListNode(node);
            return node;
        }

        @Override
        public PreviousEmploymentListNode createPreviousEmploymentListNode() {
            PreviousEmploymentListNode node = newPreviousEmploymentListNode(parent, "previousEmploymentListNode");
            previousEmploymentListNodeInjector.injectMembers(node);
            configurePreviousEmploymentListNode(node);
            return node;
        }

        @Override
        public PersonTrustNode createPersonTrustNode() {
            PersonTrustNode node = newPersonTrustNode(parent, "personTrustNode");
            personTrustNodeInjector.injectMembers(node);
            configurePersonTrustNode(node);
            return node;
        }

        @Override
        public PersonPrivacyNode createPersonPrivacyNode() {
            PersonPrivacyNode node = newPersonPrivacyNode(parent, "personPrivacyNode");
            personPrivacyNodeInjector.injectMembers(node);
            configurePersonPrivacyNode(node);
            return node;
        }

        @Override
        public PersonOtherIncomeListNode createPersonOtherIncomeListNode() {
            PersonOtherIncomeListNode node = newPersonOtherIncomeListNode(parent, "personOtherIncomeListNode");
            personOtherIncomeListNodeInjector.injectMembers(node);
            configurePersonOtherIncomeListNode(node);
            return node;
        }

        @Override
        public PersonResponsibleLendNode createPersonResponsibleLendNode() {
            PersonResponsibleLendNode node = newPersonResponsibleLendNode(parent, "personResponsibleLendNode");
            personResponsibleLendNodeInjector.injectMembers(node);
            configurePersonResponsibleLendNode(node);
            return node;
        }

    }
}

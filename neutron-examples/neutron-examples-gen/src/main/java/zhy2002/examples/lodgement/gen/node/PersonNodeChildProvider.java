package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


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

    protected PersonContactNode newPersonContactNode(
        PersonNode parent,
        String name
    ) {
        return new PersonContactNode(parent, name);
    }

    protected void configurePersonContactNode(PersonContactNode node) {
    }

    protected CurrentEmploymentListNode newCurrentEmploymentListNode(
        PersonNode parent,
        String name
    ) {
        return new CurrentEmploymentListNode(parent, name);
    }

    protected void configureCurrentEmploymentListNode(CurrentEmploymentListNode node) {
    }

    protected PreviousEmploymentListNode newPreviousEmploymentListNode(
        PersonNode parent,
        String name
    ) {
        return new PreviousEmploymentListNode(parent, name);
    }

    protected void configurePreviousEmploymentListNode(PreviousEmploymentListNode node) {
    }

    protected PersonTrustNode newPersonTrustNode(
        PersonNode parent,
        String name
    ) {
        return new PersonTrustNode(parent, name);
    }

    protected void configurePersonTrustNode(PersonTrustNode node) {
    }

    protected PersonPrivacyNode newPersonPrivacyNode(
        PersonNode parent,
        String name
    ) {
        return new PersonPrivacyNode(parent, name);
    }

    protected void configurePersonPrivacyNode(PersonPrivacyNode node) {
    }

    protected PersonOtherIncomeListNode newPersonOtherIncomeListNode(
        PersonNode parent,
        String name
    ) {
        return new PersonOtherIncomeListNode(parent, name);
    }

    protected void configurePersonOtherIncomeListNode(PersonOtherIncomeListNode node) {
    }

    protected PersonResponsibleLendNode newPersonResponsibleLendNode(
        PersonNode parent,
        String name
    ) {
        return new PersonResponsibleLendNode(parent, name);
    }

    protected void configurePersonResponsibleLendNode(PersonResponsibleLendNode node) {
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

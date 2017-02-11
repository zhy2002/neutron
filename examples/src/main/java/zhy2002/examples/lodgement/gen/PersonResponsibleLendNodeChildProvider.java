package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface PersonResponsibleLendNodeChildFactory {
    PersonTypeOfChangeNode createPersonTypeOfChangeNode();
    PersonMitigationMethodNode createPersonMitigationMethodNode();
    PersonSignificantChangeFlagNode createPersonSignificantChangeFlagNode();
    PersonRepaymentDifficultyNode createPersonRepaymentDifficultyNode();
}

@Singleton
public class PersonResponsibleLendNodeChildProvider {
    @Inject
    MembersInjector<PersonSignificantChangeFlagNode> personSignificantChangeFlagNodeInjector;
    @Inject
    MembersInjector<PersonTypeOfChangeNode> personTypeOfChangeNodeInjector;
    @Inject
    MembersInjector<PersonMitigationMethodNode> personMitigationMethodNodeInjector;
    @Inject
    MembersInjector<PersonRepaymentDifficultyNode> personRepaymentDifficultyNodeInjector;

    @Inject
    protected PersonResponsibleLendNodeChildProvider () {}

    protected MembersInjector<PersonSignificantChangeFlagNode> getPersonSignificantChangeFlagNodeInjector() {
        return this.personSignificantChangeFlagNodeInjector;
    }

    protected MembersInjector<PersonTypeOfChangeNode> getPersonTypeOfChangeNodeInjector() {
        return this.personTypeOfChangeNodeInjector;
    }

    protected MembersInjector<PersonMitigationMethodNode> getPersonMitigationMethodNodeInjector() {
        return this.personMitigationMethodNodeInjector;
    }

    protected MembersInjector<PersonRepaymentDifficultyNode> getPersonRepaymentDifficultyNodeInjector() {
        return this.personRepaymentDifficultyNodeInjector;
    }

    protected PersonTypeOfChangeNode newPersonTypeOfChangeNode(
        PersonResponsibleLendNode parent,
        String name
    ) {
        return new PersonTypeOfChangeNode(parent, name);
    }

    protected void configurePersonTypeOfChangeNode(PersonTypeOfChangeNode node) {
    }

    protected PersonMitigationMethodNode newPersonMitigationMethodNode(
        PersonResponsibleLendNode parent,
        String name
    ) {
        return new PersonMitigationMethodNode(parent, name);
    }

    protected void configurePersonMitigationMethodNode(PersonMitigationMethodNode node) {
    }

    protected PersonSignificantChangeFlagNode newPersonSignificantChangeFlagNode(
        PersonResponsibleLendNode parent,
        String name
    ) {
        return new PersonSignificantChangeFlagNode(parent, name);
    }

    protected void configurePersonSignificantChangeFlagNode(PersonSignificantChangeFlagNode node) {
    }

    protected PersonRepaymentDifficultyNode newPersonRepaymentDifficultyNode(
        PersonResponsibleLendNode parent,
        String name
    ) {
        return new PersonRepaymentDifficultyNode(parent, name);
    }

    protected void configurePersonRepaymentDifficultyNode(PersonRepaymentDifficultyNode node) {
    }

    PersonResponsibleLendNodeChildFactory createFactory(PersonResponsibleLendNode parent) {
        return new PersonResponsibleLendNodeChildFactoryImpl(parent);
    }

    private class PersonResponsibleLendNodeChildFactoryImpl implements PersonResponsibleLendNodeChildFactory {

        private final PersonResponsibleLendNode parent;
        
        private PersonResponsibleLendNodeChildFactoryImpl(PersonResponsibleLendNode parent) {
            this.parent = parent;
        }

        @Override
        public PersonTypeOfChangeNode createPersonTypeOfChangeNode() {
            PersonTypeOfChangeNode node = newPersonTypeOfChangeNode(parent, "personTypeOfChangeNode");
            personTypeOfChangeNodeInjector.injectMembers(node);
            configurePersonTypeOfChangeNode(node);
            return node;
        }

        @Override
        public PersonMitigationMethodNode createPersonMitigationMethodNode() {
            PersonMitigationMethodNode node = newPersonMitigationMethodNode(parent, "personMitigationMethodNode");
            personMitigationMethodNodeInjector.injectMembers(node);
            configurePersonMitigationMethodNode(node);
            return node;
        }

        @Override
        public PersonSignificantChangeFlagNode createPersonSignificantChangeFlagNode() {
            PersonSignificantChangeFlagNode node = newPersonSignificantChangeFlagNode(parent, "personSignificantChangeFlagNode");
            personSignificantChangeFlagNodeInjector.injectMembers(node);
            configurePersonSignificantChangeFlagNode(node);
            return node;
        }

        @Override
        public PersonRepaymentDifficultyNode createPersonRepaymentDifficultyNode() {
            PersonRepaymentDifficultyNode node = newPersonRepaymentDifficultyNode(parent, "personRepaymentDifficultyNode");
            personRepaymentDifficultyNodeInjector.injectMembers(node);
            configurePersonRepaymentDifficultyNode(node);
            return node;
        }

    }
}

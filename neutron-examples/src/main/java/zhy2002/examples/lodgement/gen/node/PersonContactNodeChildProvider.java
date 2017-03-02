package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface PersonContactNodeChildFactory {
    PersonHomePhoneNode createPersonHomePhoneNode();
}

@Singleton
public class PersonContactNodeChildProvider {
    @Inject
    MembersInjector<PersonHomePhoneNode> personHomePhoneNodeInjector;

    @Inject
    protected PersonContactNodeChildProvider () {}

    protected MembersInjector<PersonHomePhoneNode> getPersonHomePhoneNodeInjector() {
        return this.personHomePhoneNodeInjector;
    }

    protected PersonHomePhoneNode newPersonHomePhoneNode(
        PersonContactNode parent,
        String name
    ) {
        return new PersonHomePhoneNode(parent, name);
    }

    protected void configurePersonHomePhoneNode(PersonHomePhoneNode node) {
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
        public PersonHomePhoneNode createPersonHomePhoneNode() {
            PersonHomePhoneNode node = newPersonHomePhoneNode(parent, "personHomePhoneNode");
            personHomePhoneNodeInjector.injectMembers(node);
            configurePersonHomePhoneNode(node);
            return node;
        }

    }
}

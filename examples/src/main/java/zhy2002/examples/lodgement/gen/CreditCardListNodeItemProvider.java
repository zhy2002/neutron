package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface CreditCardListNodeItemFactory {
    CreditCardNode createCreditCardNode(String name);
}

@Singleton
public class CreditCardListNodeItemProvider {
    @Inject
    MembersInjector<CreditCardNode> creditCardNodeInjector;

    @Inject
    protected CreditCardListNodeItemProvider () {}

    protected MembersInjector<CreditCardNode> getCreditCardNodeInjector() {
        return this.creditCardNodeInjector;
    }

    protected CreditCardNode newCreditCardNode (
        CreditCardListNode parent,
        String name
    ) {
        return new CreditCardNode(parent, name);
    }

    protected void configureCreditCardNode(CreditCardNode node) {
    }

    CreditCardListNodeItemFactory createFactory(CreditCardListNode parent) {
        return new CreditCardListNodeItemFactoryImpl(parent);
    }

    private class CreditCardListNodeItemFactoryImpl implements CreditCardListNodeItemFactory {

        private final CreditCardListNode parent;
        
        private CreditCardListNodeItemFactoryImpl(CreditCardListNode parent) {
            this.parent = parent;
        }

        @Override
        public CreditCardNode createCreditCardNode(String name) {
            CreditCardNode node = newCreditCardNode(parent, name);
            creditCardNodeInjector.injectMembers(node);
            configureCreditCardNode(node);
            return node;
        }

    }
}

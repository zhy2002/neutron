package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface CreditCardListNodeItemFactory {
    NodeAddEvent<CreditCardNode> createItemAddEvent(String name);
    NodeRemoveEvent<CreditCardNode> createItemRemoveEvent(CreditCardNode item);
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

    protected NodeAddEvent<CreditCardNode> newItemAddEvent(CreditCardNode item) {
        return new CreditCardNodeAddEvent(item);
    }

    protected NodeRemoveEvent<CreditCardNode> newItemRemoveEvent(CreditCardNode item) {
        return new CreditCardNodeRemoveEvent(item);
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
        public final NodeAddEvent<CreditCardNode> createItemAddEvent(String name) {
            CreditCardNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<CreditCardNode> createItemRemoveEvent(CreditCardNode item) {
            return newItemRemoveEvent(item);
        }

        private CreditCardNode createItemNode(String name) {
            CreditCardNode node = newCreditCardNode(parent, name);
            creditCardNodeInjector.injectMembers(node);
            configureCreditCardNode(node);
            return node;
        }

    }
}

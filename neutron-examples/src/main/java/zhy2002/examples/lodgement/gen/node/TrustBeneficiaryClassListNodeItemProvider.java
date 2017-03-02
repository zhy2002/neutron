package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface TrustBeneficiaryClassListNodeItemFactory {
    NodeAddEvent<TrustBeneficiaryClassNode> createItemAddEvent(String name);
    NodeRemoveEvent<TrustBeneficiaryClassNode> createItemRemoveEvent(TrustBeneficiaryClassNode item);
}

@Singleton
public class TrustBeneficiaryClassListNodeItemProvider {
    @Inject
    MembersInjector<TrustBeneficiaryClassNode> trustBeneficiaryClassNodeInjector;

    @Inject
    protected TrustBeneficiaryClassListNodeItemProvider () {}

    protected MembersInjector<TrustBeneficiaryClassNode> getTrustBeneficiaryClassNodeInjector() {
        return this.trustBeneficiaryClassNodeInjector;
    }

    protected TrustBeneficiaryClassNode newTrustBeneficiaryClassNode (
        TrustBeneficiaryClassListNode parent,
        String name
    ) {
        return new TrustBeneficiaryClassNode(parent, name);
    }

    protected void configureTrustBeneficiaryClassNode(TrustBeneficiaryClassNode node) {
    }

    protected NodeAddEvent<TrustBeneficiaryClassNode> newItemAddEvent(TrustBeneficiaryClassNode item) {
        return new TrustBeneficiaryClassNodeAddEvent(item);
    }

    protected NodeRemoveEvent<TrustBeneficiaryClassNode> newItemRemoveEvent(TrustBeneficiaryClassNode item) {
        return new TrustBeneficiaryClassNodeRemoveEvent(item);
    }

    TrustBeneficiaryClassListNodeItemFactory createFactory(TrustBeneficiaryClassListNode parent) {
        return new TrustBeneficiaryClassListNodeItemFactoryImpl(parent);
    }

    private class TrustBeneficiaryClassListNodeItemFactoryImpl implements TrustBeneficiaryClassListNodeItemFactory {

        private final TrustBeneficiaryClassListNode parent;
        
        private TrustBeneficiaryClassListNodeItemFactoryImpl(TrustBeneficiaryClassListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<TrustBeneficiaryClassNode> createItemAddEvent(String name) {
            TrustBeneficiaryClassNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<TrustBeneficiaryClassNode> createItemRemoveEvent(TrustBeneficiaryClassNode item) {
            return newItemRemoveEvent(item);
        }

        private TrustBeneficiaryClassNode createItemNode(String name) {
            TrustBeneficiaryClassNode node = newTrustBeneficiaryClassNode(parent, name);
            trustBeneficiaryClassNodeInjector.injectMembers(node);
            configureTrustBeneficiaryClassNode(node);
            return node;
        }

    }
}

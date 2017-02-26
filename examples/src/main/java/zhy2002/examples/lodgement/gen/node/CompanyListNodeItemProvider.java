package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface CompanyListNodeItemFactory {
    NodeAddEvent<CompanyNode> createItemAddEvent(String name);
    NodeRemoveEvent<CompanyNode> createItemRemoveEvent(CompanyNode item);
}

@Singleton
public class CompanyListNodeItemProvider {
    @Inject
    MembersInjector<CompanyNode> companyNodeInjector;

    @Inject
    protected CompanyListNodeItemProvider () {}

    protected MembersInjector<CompanyNode> getCompanyNodeInjector() {
        return this.companyNodeInjector;
    }

    protected CompanyNode newCompanyNode (
        CompanyListNode parent,
        String name
    ) {
        return new CompanyNode(parent, name);
    }

    protected void configureCompanyNode(CompanyNode node) {
    }

    protected NodeAddEvent<CompanyNode> newItemAddEvent(CompanyNode item) {
        return new CompanyNodeAddEvent(item);
    }

    protected NodeRemoveEvent<CompanyNode> newItemRemoveEvent(CompanyNode item) {
        return new CompanyNodeRemoveEvent(item);
    }

    CompanyListNodeItemFactory createFactory(CompanyListNode parent) {
        return new CompanyListNodeItemFactoryImpl(parent);
    }

    private class CompanyListNodeItemFactoryImpl implements CompanyListNodeItemFactory {

        private final CompanyListNode parent;
        
        private CompanyListNodeItemFactoryImpl(CompanyListNode parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<CompanyNode> createItemAddEvent(String name) {
            CompanyNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<CompanyNode> createItemRemoveEvent(CompanyNode item) {
            return newItemRemoveEvent(item);
        }

        private CompanyNode createItemNode(String name) {
            CompanyNode node = newCompanyNode(parent, name);
            companyNodeInjector.injectMembers(node);
            configureCompanyNode(node);
            return node;
        }

    }
}

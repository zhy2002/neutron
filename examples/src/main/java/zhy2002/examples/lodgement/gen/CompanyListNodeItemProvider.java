package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface CompanyListNodeItemFactory {
    CompanyNode createCompanyNode(String name);
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

    CompanyListNodeItemFactory createFactory(CompanyListNode parent) {
        return new CompanyListNodeItemFactoryImpl(parent);
    }

    private class CompanyListNodeItemFactoryImpl implements CompanyListNodeItemFactory {

        private final CompanyListNode parent;
        
        private CompanyListNodeItemFactoryImpl(CompanyListNode parent) {
            this.parent = parent;
        }

        @Override
        public CompanyNode createCompanyNode(String name) {
            CompanyNode node = newCompanyNode(parent, name);
            companyNodeInjector.injectMembers(node);
            configureCompanyNode(node);
            return node;
        }

    }
}

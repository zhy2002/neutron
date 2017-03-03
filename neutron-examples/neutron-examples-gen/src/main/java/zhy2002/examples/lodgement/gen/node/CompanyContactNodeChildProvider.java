package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface CompanyContactNodeChildFactory {
    CompanyContactFirstNameNode createCompanyContactFirstNameNode();
    CompanyContactLastNameNode createCompanyContactLastNameNode();
}

@Singleton
public class CompanyContactNodeChildProvider {
    @Inject
    MembersInjector<CompanyContactFirstNameNode> companyContactFirstNameNodeInjector;
    @Inject
    MembersInjector<CompanyContactLastNameNode> companyContactLastNameNodeInjector;

    @Inject
    protected CompanyContactNodeChildProvider () {}

    protected MembersInjector<CompanyContactFirstNameNode> getCompanyContactFirstNameNodeInjector() {
        return this.companyContactFirstNameNodeInjector;
    }

    protected MembersInjector<CompanyContactLastNameNode> getCompanyContactLastNameNodeInjector() {
        return this.companyContactLastNameNodeInjector;
    }

    protected CompanyContactFirstNameNode newCompanyContactFirstNameNode(
        CompanyContactNode parent,
        String name
    ) {
        return new CompanyContactFirstNameNode(parent, name);
    }

    protected void configureCompanyContactFirstNameNode(CompanyContactFirstNameNode node) {
    }

    protected CompanyContactLastNameNode newCompanyContactLastNameNode(
        CompanyContactNode parent,
        String name
    ) {
        return new CompanyContactLastNameNode(parent, name);
    }

    protected void configureCompanyContactLastNameNode(CompanyContactLastNameNode node) {
    }

    CompanyContactNodeChildFactory createFactory(CompanyContactNode parent) {
        return new CompanyContactNodeChildFactoryImpl(parent);
    }

    private class CompanyContactNodeChildFactoryImpl implements CompanyContactNodeChildFactory {

        private final CompanyContactNode parent;
        
        private CompanyContactNodeChildFactoryImpl(CompanyContactNode parent) {
            this.parent = parent;
        }

        @Override
        public CompanyContactFirstNameNode createCompanyContactFirstNameNode() {
            CompanyContactFirstNameNode node = newCompanyContactFirstNameNode(parent, "companyContactFirstNameNode");
            companyContactFirstNameNodeInjector.injectMembers(node);
            configureCompanyContactFirstNameNode(node);
            return node;
        }

        @Override
        public CompanyContactLastNameNode createCompanyContactLastNameNode() {
            CompanyContactLastNameNode node = newCompanyContactLastNameNode(parent, "companyContactLastNameNode");
            companyContactLastNameNodeInjector.injectMembers(node);
            configureCompanyContactLastNameNode(node);
            return node;
        }

    }
}

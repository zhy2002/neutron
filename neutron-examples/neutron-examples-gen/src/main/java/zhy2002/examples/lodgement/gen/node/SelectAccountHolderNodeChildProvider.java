package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface SelectAccountHolderNodeChildFactory {
    AccountHolderReferenceNode createAccountHolderReferenceNode();
    SelectAccountHolderFlagNode createSelectAccountHolderFlagNode();
}

@Singleton
public class SelectAccountHolderNodeChildProvider {
    @Inject
    MembersInjector<SelectAccountHolderFlagNode> selectAccountHolderFlagNodeInjector;
    @Inject
    MembersInjector<AccountHolderReferenceNode> accountHolderReferenceNodeInjector;

    @Inject
    protected SelectAccountHolderNodeChildProvider () {}

    protected MembersInjector<SelectAccountHolderFlagNode> getSelectAccountHolderFlagNodeInjector() {
        return this.selectAccountHolderFlagNodeInjector;
    }

    protected MembersInjector<AccountHolderReferenceNode> getAccountHolderReferenceNodeInjector() {
        return this.accountHolderReferenceNodeInjector;
    }

    protected AccountHolderReferenceNode newAccountHolderReferenceNode(
        SelectAccountHolderNode parent,
        String name
    ) {
        return new AccountHolderReferenceNode(parent, name);
    }

    protected void configureAccountHolderReferenceNode(AccountHolderReferenceNode node) {
    }

    protected SelectAccountHolderFlagNode newSelectAccountHolderFlagNode(
        SelectAccountHolderNode parent,
        String name
    ) {
        return new SelectAccountHolderFlagNode(parent, name);
    }

    protected void configureSelectAccountHolderFlagNode(SelectAccountHolderFlagNode node) {
    }

    SelectAccountHolderNodeChildFactory createFactory(SelectAccountHolderNode parent) {
        return new SelectAccountHolderNodeChildFactoryImpl(parent);
    }

    private class SelectAccountHolderNodeChildFactoryImpl implements SelectAccountHolderNodeChildFactory {

        private final SelectAccountHolderNode parent;
        
        private SelectAccountHolderNodeChildFactoryImpl(SelectAccountHolderNode parent) {
            this.parent = parent;
        }

        @Override
        public AccountHolderReferenceNode createAccountHolderReferenceNode() {
            AccountHolderReferenceNode node = newAccountHolderReferenceNode(parent, "accountHolderReferenceNode");
            accountHolderReferenceNodeInjector.injectMembers(node);
            configureAccountHolderReferenceNode(node);
            return node;
        }

        @Override
        public SelectAccountHolderFlagNode createSelectAccountHolderFlagNode() {
            SelectAccountHolderFlagNode node = newSelectAccountHolderFlagNode(parent, "selectAccountHolderFlagNode");
            selectAccountHolderFlagNodeInjector.injectMembers(node);
            configureSelectAccountHolderFlagNode(node);
            return node;
        }

    }
}

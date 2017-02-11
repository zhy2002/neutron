package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface LoanListNodeItemFactory {
    LoanNode createLoanNode(String name);
}

@Singleton
public class LoanListNodeItemProvider {
    @Inject
    MembersInjector<LoanNode> loanNodeInjector;

    @Inject
    protected LoanListNodeItemProvider () {}

    protected MembersInjector<LoanNode> getLoanNodeInjector() {
        return this.loanNodeInjector;
    }

    protected LoanNode newLoanNode (
        LoanListNode parent,
        String name
    ) {
        return new LoanNode(parent, name);
    }

    protected void configureLoanNode(LoanNode node) {
    }

    LoanListNodeItemFactory createFactory(LoanListNode parent) {
        return new LoanListNodeItemFactoryImpl(parent);
    }

    private class LoanListNodeItemFactoryImpl implements LoanListNodeItemFactory {

        private final LoanListNode parent;
        
        private LoanListNodeItemFactoryImpl(LoanListNode parent) {
            this.parent = parent;
        }

        @Override
        public LoanNode createLoanNode(String name) {
            LoanNode node = newLoanNode(parent, name);
            loanNodeInjector.injectMembers(node);
            configureLoanNode(node);
            return node;
        }

    }
}

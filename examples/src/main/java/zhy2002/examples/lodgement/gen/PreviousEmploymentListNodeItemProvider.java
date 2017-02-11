package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface PreviousEmploymentListNodeItemFactory {
    PreviousEmploymentNode createPreviousEmploymentNode(String name);
}

@Singleton
public class PreviousEmploymentListNodeItemProvider {
    @Inject
    MembersInjector<PreviousEmploymentNode> previousEmploymentNodeInjector;

    @Inject
    protected PreviousEmploymentListNodeItemProvider () {}

    protected MembersInjector<PreviousEmploymentNode> getPreviousEmploymentNodeInjector() {
        return this.previousEmploymentNodeInjector;
    }

    protected PreviousEmploymentNode newPreviousEmploymentNode (
        PreviousEmploymentListNode parent,
        String name
    ) {
        return new PreviousEmploymentNode(parent, name);
    }

    protected void configurePreviousEmploymentNode(PreviousEmploymentNode node) {
    }

    PreviousEmploymentListNodeItemFactory createFactory(PreviousEmploymentListNode parent) {
        return new PreviousEmploymentListNodeItemFactoryImpl(parent);
    }

    private class PreviousEmploymentListNodeItemFactoryImpl implements PreviousEmploymentListNodeItemFactory {

        private final PreviousEmploymentListNode parent;
        
        private PreviousEmploymentListNodeItemFactoryImpl(PreviousEmploymentListNode parent) {
            this.parent = parent;
        }

        @Override
        public PreviousEmploymentNode createPreviousEmploymentNode(String name) {
            PreviousEmploymentNode node = newPreviousEmploymentNode(parent, name);
            previousEmploymentNodeInjector.injectMembers(node);
            configurePreviousEmploymentNode(node);
            return node;
        }

    }
}

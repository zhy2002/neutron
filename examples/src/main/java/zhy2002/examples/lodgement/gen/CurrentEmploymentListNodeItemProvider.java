package zhy2002.examples.lodgement.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface CurrentEmploymentListNodeItemFactory {
    CurrentEmploymentNode createCurrentEmploymentNode(String name);
}

@Singleton
public class CurrentEmploymentListNodeItemProvider {
    @Inject
    MembersInjector<CurrentEmploymentNode> currentEmploymentNodeInjector;

    @Inject
    protected CurrentEmploymentListNodeItemProvider () {}

    protected MembersInjector<CurrentEmploymentNode> getCurrentEmploymentNodeInjector() {
        return this.currentEmploymentNodeInjector;
    }

    protected CurrentEmploymentNode newCurrentEmploymentNode (
        CurrentEmploymentListNode parent,
        String name
    ) {
        return new CurrentEmploymentNode(parent, name);
    }

    protected void configureCurrentEmploymentNode(CurrentEmploymentNode node) {
    }

    CurrentEmploymentListNodeItemFactory createFactory(CurrentEmploymentListNode parent) {
        return new CurrentEmploymentListNodeItemFactoryImpl(parent);
    }

    private class CurrentEmploymentListNodeItemFactoryImpl implements CurrentEmploymentListNodeItemFactory {

        private final CurrentEmploymentListNode parent;
        
        private CurrentEmploymentListNodeItemFactoryImpl(CurrentEmploymentListNode parent) {
            this.parent = parent;
        }

        @Override
        public CurrentEmploymentNode createCurrentEmploymentNode(String name) {
            CurrentEmploymentNode node = newCurrentEmploymentNode(parent, name);
            currentEmploymentNodeInjector.injectMembers(node);
            configureCurrentEmploymentNode(node);
            return node;
        }

    }
}

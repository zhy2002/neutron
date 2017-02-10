package zhy2002.examples.register.gen;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;


interface ErrorListNodeItemFactory {
    ErrorNode createErrorNode(String name);
}

@Singleton
public class ErrorListNodeItemProvider {
    @Inject
    MembersInjector<ErrorNode> errorNodeInjector;

    @Inject
    protected ErrorListNodeItemProvider () {}

    protected MembersInjector<ErrorNode> getErrorNodeInjector() {
        return this.errorNodeInjector;
    }

    protected ErrorNode newErrorNode (
        ErrorListNode parent,
        String name
    ) {
        return new ErrorNode(parent, name);
    }

    ErrorListNodeItemFactory createFactory(ErrorListNode parent) {
        return new ErrorListNodeItemFactoryImpl(parent);
    }

    private class ErrorListNodeItemFactoryImpl implements ErrorListNodeItemFactory {

        private final ErrorListNode parent;
        
        private ErrorListNodeItemFactoryImpl(ErrorListNode parent) {
            this.parent = parent;
        }

        @Override
        public ErrorNode createErrorNode(String name) {
            ErrorNode node = newErrorNode(parent, name);
            errorNodeInjector.injectMembers(node);
            return node;
        }

    }
}

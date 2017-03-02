package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.register.gen.event.*;

interface ErrorListNodeItemFactory {
    NodeAddEvent<ErrorNode> createItemAddEvent(String name);
    NodeRemoveEvent<ErrorNode> createItemRemoveEvent(ErrorNode item);
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

    protected void configureErrorNode(ErrorNode node) {
    }

    protected NodeAddEvent<ErrorNode> newItemAddEvent(ErrorNode item) {
        return new ErrorNodeAddEvent(item);
    }

    protected NodeRemoveEvent<ErrorNode> newItemRemoveEvent(ErrorNode item) {
        return new ErrorNodeRemoveEvent(item);
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
        public final NodeAddEvent<ErrorNode> createItemAddEvent(String name) {
            ErrorNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<ErrorNode> createItemRemoveEvent(ErrorNode item) {
            return newItemRemoveEvent(item);
        }

        private ErrorNode createItemNode(String name) {
            ErrorNode node = newErrorNode(parent, name);
            errorNodeInjector.injectMembers(node);
            configureErrorNode(node);
            return node;
        }

    }
}

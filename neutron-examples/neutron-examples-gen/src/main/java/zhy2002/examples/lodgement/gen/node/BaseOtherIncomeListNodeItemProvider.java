package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.inject.Inject;
import javax.inject.Singleton;
import zhy2002.neutron.NodeAddEvent;
import zhy2002.neutron.NodeRemoveEvent;
import zhy2002.examples.lodgement.gen.event.*;

interface BaseOtherIncomeListNodeItemFactory {
    NodeAddEvent<OtherIncomeNode> createItemAddEvent(String name);
    NodeRemoveEvent<OtherIncomeNode> createItemRemoveEvent(OtherIncomeNode item);
}

@Singleton
public class BaseOtherIncomeListNodeItemProvider {
    @Inject
    MembersInjector<OtherIncomeNode> otherIncomeNodeInjector;

    @Inject
    protected BaseOtherIncomeListNodeItemProvider () {}

    protected MembersInjector<OtherIncomeNode> getOtherIncomeNodeInjector() {
        return this.otherIncomeNodeInjector;
    }

    protected OtherIncomeNode newOtherIncomeNode (
        BaseOtherIncomeListNode<?> parent,
        String name
    ) {
        return new OtherIncomeNode(parent, name);
    }

    protected void configureOtherIncomeNode(OtherIncomeNode node) {
    }

    protected NodeAddEvent<OtherIncomeNode> newItemAddEvent(OtherIncomeNode item) {
        return new OtherIncomeNodeAddEvent(item);
    }

    protected NodeRemoveEvent<OtherIncomeNode> newItemRemoveEvent(OtherIncomeNode item) {
        return new OtherIncomeNodeRemoveEvent(item);
    }

    BaseOtherIncomeListNodeItemFactory createFactory(BaseOtherIncomeListNode<?> parent) {
        return new BaseOtherIncomeListNodeItemFactoryImpl(parent);
    }

    private class BaseOtherIncomeListNodeItemFactoryImpl implements BaseOtherIncomeListNodeItemFactory {

        private final BaseOtherIncomeListNode<?> parent;
        
        private BaseOtherIncomeListNodeItemFactoryImpl(BaseOtherIncomeListNode<?> parent) {
            this.parent = parent;
        }

        @Override
        public final NodeAddEvent<OtherIncomeNode> createItemAddEvent(String name) {
            OtherIncomeNode item = createItemNode(name);
            return newItemAddEvent(item);
        }

        @Override
        public final NodeRemoveEvent<OtherIncomeNode> createItemRemoveEvent(OtherIncomeNode item) {
            return newItemRemoveEvent(item);
        }

        private OtherIncomeNode createItemNode(String name) {
            OtherIncomeNode node = newOtherIncomeNode(parent, name);
            otherIncomeNodeInjector.injectMembers(node);
            configureOtherIncomeNode(node);
            return node;
        }

    }
}

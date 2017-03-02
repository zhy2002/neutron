package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CreditHistoryListNode extends ListUiNode<BasePrivacyNode<?>,CreditHistoryNode> {

    private CreditHistoryListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(CreditHistoryListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CreditHistoryListNode.class;
    }

    private CreditHistoryListNodeComponent component;

    @Inject
    void createComponent(CreditHistoryListNodeComponent.Builder builder) {
        this.component = builder.setCreditHistoryListNodeModule(new CreditHistoryListNodeModule(this)).build();
    }

    @Override
    protected CreditHistoryListNodeRuleProvider getRuleProvider() {
        return component.getCreditHistoryListNodeRuleProvider();
    }

    public CreditHistoryListNode(@NotNull BasePrivacyNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<CreditHistoryNode> getItemClass() {
        return CreditHistoryNode.class;
    }

    public NodeAddEvent<CreditHistoryNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<CreditHistoryNode> createItemRemoveEvent(CreditHistoryNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}

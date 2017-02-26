package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class SavingsAccountListNode extends ListUiNode<AssetsNode,SavingsAccountNode> {

    private SavingsAccountListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(SavingsAccountListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return SavingsAccountListNode.class;
    }

    private SavingsAccountListNodeComponent component;

    @Inject
    void createComponent(SavingsAccountListNodeComponent.Builder builder) {
        this.component = builder.setSavingsAccountListNodeModule(new SavingsAccountListNodeModule(this)).build();
    }

    @Override
    protected SavingsAccountListNodeRuleProvider getRuleProvider() {
        return component.getSavingsAccountListNodeRuleProvider();
    }

    public SavingsAccountListNode(@NotNull AssetsNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<SavingsAccountNode> getItemClass() {
        return SavingsAccountNode.class;
    }

    public NodeAddEvent<SavingsAccountNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<SavingsAccountNode> createItemRemoveEvent(SavingsAccountNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}
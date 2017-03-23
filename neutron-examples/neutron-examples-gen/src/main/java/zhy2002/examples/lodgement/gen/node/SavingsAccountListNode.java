package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private SavingsAccountListNodeRuleProvider getRuleProvider() {
        return component.getSavingsAccountListNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<SavingsAccountListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public SavingsAccountListNode(@NotNull AssetsNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<SavingsAccountNode> getItemClass() {
        return SavingsAccountNode.class;
    }

    @Override
    public NodeAddEvent<SavingsAccountNode> createItemAddEvent(String name) {
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<SavingsAccountNode> createItemRemoveEvent(SavingsAccountNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}

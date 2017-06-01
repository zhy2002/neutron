package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SavingsAccountListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class SavingsAccountListNode extends ListUiNode<AssetsNode,SavingsAccountNode> {

    @Inject
    public SavingsAccountListNode(@Owner AssetsNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SavingsAccountListNode.class;
    }

    private SavingsAccountListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(SavingsAccountListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }



    protected final SavingsAccountListNodeComponent getComponent() {
        return component;
    }


    private SavingsAccountListNodeComponent component;

    @Inject
    void createComponent(SavingsAccountListNodeComponent.Builder builder) {
        this.component = builder.setSavingsAccountListNodeModule(new SavingsAccountListNodeModule(this)).build();
    }

    private RuleProvider<SavingsAccountListNode> getRuleProvider() {
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

    @Override
    public Class<SavingsAccountNode> getItemClass() {
        return SavingsAccountNode.class;
    }

    @Override
    public NodeAddEvent<SavingsAccountNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<SavingsAccountNode> createItemRemoveEvent(SavingsAccountNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}

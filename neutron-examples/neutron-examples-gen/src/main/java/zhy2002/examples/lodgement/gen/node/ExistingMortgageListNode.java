package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ExistingMortgageListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ExistingMortgageListNode extends ListUiNode<UsageNode,ExistingMortgageNode> {

    @Inject
    public ExistingMortgageListNode(@Owner UsageNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ExistingMortgageListNode.class;
    }

    private ExistingMortgageListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(ExistingMortgageListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    protected final ExistingMortgageListNodeComponent getComponent() {
        return component;
    }


    private ExistingMortgageListNodeComponent component;

    @Inject
    void createComponent(ExistingMortgageListNodeComponent.Builder builder) {
        this.component = builder.setExistingMortgageListNodeModule(new ExistingMortgageListNodeModule(this)).build();
    }

    private RuleProvider<ExistingMortgageListNode> getRuleProvider() {
        return component.getExistingMortgageListNodeRuleProvider();
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

    private RuleProvider<ExistingMortgageListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @Override
    public Class<ExistingMortgageNode> getItemClass() {
        return ExistingMortgageNode.class;
    }

    @Override
    public NodeAddEvent<ExistingMortgageNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<ExistingMortgageNode> createItemRemoveEvent(ExistingMortgageNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}

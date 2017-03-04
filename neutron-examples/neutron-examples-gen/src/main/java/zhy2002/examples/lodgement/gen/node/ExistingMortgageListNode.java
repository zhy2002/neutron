package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ExistingMortgageListNode extends ListUiNode<UsageNode,ExistingMortgageNode> {

    private ExistingMortgageListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(ExistingMortgageListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ExistingMortgageListNode.class;
    }

    private ExistingMortgageListNodeComponent component;

    @Inject
    void createComponent(ExistingMortgageListNodeComponent.Builder builder) {
        this.component = builder.setExistingMortgageListNodeModule(new ExistingMortgageListNodeModule(this)).build();
    }

    @Override
    protected ExistingMortgageListNodeRuleProvider getRuleProvider() {
        return component.getExistingMortgageListNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ExistingMortgageListNode(@NotNull UsageNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<ExistingMortgageNode> getItemClass() {
        return ExistingMortgageNode.class;
    }

    public NodeAddEvent<ExistingMortgageNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<ExistingMortgageNode> createItemRemoveEvent(ExistingMortgageNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}

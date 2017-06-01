package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ExistingMortgageListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class ExistingMortgageListNode extends ListUiNode<UsageNode,ExistingMortgageNode> {

    @Inject
    public ExistingMortgageListNode(@Owner UsageNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ExistingMortgageListNode.class;
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
        getContext().setNameOfNodeBeingCreated(name);
        ExistingMortgageNode item = getComponent().createExistingMortgageNode();
        getContext().setNameOfNodeBeingCreated(null);
        return new ExistingMortgageNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<ExistingMortgageNode> createItemRemoveEvent(ExistingMortgageNode item) {
        return new ExistingMortgageNodeRemoveEvent(item);
    }

}

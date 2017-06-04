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


public class ExistingMortgageListNode extends ListUiNode<UsageNode, ExistingMortgageNode> {

    @Inject
    protected ExistingMortgageListNode(@Owner UsageNode parent) {
        super(parent);
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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    @Override
    public Class<ExistingMortgageNode> getItemClass() {
        return ExistingMortgageNode.class;
    }

    @Override
    public NodeAddEvent<ExistingMortgageNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        ExistingMortgageNode item = getComponent().createExistingMortgageNode();
        setNameOfChildBeingCreated(null);
        return new ExistingMortgageNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<ExistingMortgageNode> createItemRemoveEvent(ExistingMortgageNode item) {
        return new ExistingMortgageNodeRemoveEvent(item);
    }

}

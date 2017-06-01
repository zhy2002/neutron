package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CreditCardListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class CreditCardListNode extends ListUiNode<LiabilitiesNode,CreditCardNode> {

    @Inject
    public CreditCardListNode(@Owner LiabilitiesNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CreditCardListNode.class;
    }

    protected final CreditCardListNodeComponent getComponent() {
        return component;
    }


    private CreditCardListNodeComponent component;

    @Inject
    void createComponent(CreditCardListNodeComponent.Builder builder) {
        this.component = builder.setCreditCardListNodeModule(new CreditCardListNodeModule(this)).build();
    }

    private RuleProvider<CreditCardListNode> getRuleProvider() {
        return component.getCreditCardListNodeRuleProvider();
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

    private RuleProvider<CreditCardListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @Override
    public Class<CreditCardNode> getItemClass() {
        return CreditCardNode.class;
    }

    @Override
    public NodeAddEvent<CreditCardNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        getContext().setNameOfNodeBeingCreated(name);
        CreditCardNode item = getComponent().createCreditCardNode();
        getContext().setNameOfNodeBeingCreated(null);
        return new CreditCardNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<CreditCardNode> createItemRemoveEvent(CreditCardNode item) {
        return new CreditCardNodeRemoveEvent(item);
    }

}

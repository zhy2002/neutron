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
    public CreditCardListNode(@Owner LiabilitiesNode parent) {
        super(parent);
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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    @Override
    public Class<CreditCardNode> getItemClass() {
        return CreditCardNode.class;
    }

    @Override
    public NodeAddEvent<CreditCardNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        CreditCardNode item = getComponent().createCreditCardNode();
        setNameOfChildBeingCreated(null);
        return new CreditCardNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<CreditCardNode> createItemRemoveEvent(CreditCardNode item) {
        return new CreditCardNodeRemoveEvent(item);
    }

}

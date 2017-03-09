package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CreditCardListNode extends ListUiNode<LiabilitiesNode,CreditCardNode> {

    private CreditCardListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(CreditCardListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CreditCardListNode.class;
    }

    private CreditCardListNodeComponent component;

    @Inject
    void createComponent(CreditCardListNodeComponent.Builder builder) {
        this.component = builder.setCreditCardListNodeModule(new CreditCardListNodeModule(this)).build();
    }

    private CreditCardListNodeRuleProvider getRuleProvider() {
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

    public CreditCardListNode(@NotNull LiabilitiesNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<CreditCardNode> getItemClass() {
        return CreditCardNode.class;
    }

    public NodeAddEvent<CreditCardNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<CreditCardNode> createItemRemoveEvent(CreditCardNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}

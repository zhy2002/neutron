package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

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

    @Override
    protected CreditCardListNodeRuleProvider getRuleProvider() {
        return component.getCreditCardListNodeRuleProvider();
    }

    public CreditCardListNode(LiabilitiesNode parent, String name) {
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

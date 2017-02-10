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

public class CreditCardListNode extends ListUiNode<LiabilitiesNode,CreditCardListNode,CreditCardNode>
{
    private CreditCardListNodeItemFactory itemFactory;

    @Inject
    void receiveProviders(CreditCardListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<CreditCardListNode> config = classRegistry.getUiNodeConfig(CreditCardListNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public CreditCardListNode(LiabilitiesNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<CreditCardNode> getItemClass() {
        return CreditCardNode.class;
    }

    @Override
    protected <M extends CreditCardNode> CreditCardNode createItemNode(Class<M> itemClass, String name) {
        return itemFactory.createCreditCardNode(name);
    }



}

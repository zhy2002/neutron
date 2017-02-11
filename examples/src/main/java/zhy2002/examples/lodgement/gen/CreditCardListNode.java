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
    void receiveNodeProvider(CreditCardListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
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

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

public class SavingsAccountListNode extends ListUiNode<AssetsNode,SavingsAccountListNode,SavingsAccountNode>
{
    private SavingsAccountListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(SavingsAccountListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    public SavingsAccountListNode(AssetsNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<SavingsAccountNode> getItemClass() {
        return SavingsAccountNode.class;
    }

    @Override
    protected <M extends SavingsAccountNode> SavingsAccountNode createItemNode(Class<M> itemClass, String name) {
        return itemFactory.createSavingsAccountNode(name);
    }

}

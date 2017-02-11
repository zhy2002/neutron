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

public class RealEstateListNode extends ListUiNode<ApplicationNode,RealEstateListNode,RealEstateNode>
{
    private RealEstateListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(RealEstateListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    public RealEstateListNode(ApplicationNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<RealEstateNode> getItemClass() {
        return RealEstateNode.class;
    }

    @Override
    protected <M extends RealEstateNode> RealEstateNode createItemNode(Class<M> itemClass, String name) {
        return itemFactory.createRealEstateNode(name);
    }

}

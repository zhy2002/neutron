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

public class LoanListNode extends ListUiNode<LiabilitiesNode,LoanListNode,LoanNode>
{
    private LoanListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(LoanListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<LoanListNode> config = classRegistry.getUiNodeConfig(LoanListNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public LoanListNode(LiabilitiesNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<LoanNode> getItemClass() {
        return LoanNode.class;
    }

    @Override
    protected <M extends LoanNode> LoanNode createItemNode(Class<M> itemClass, String name) {
        return itemFactory.createLoanNode(name);
    }

}

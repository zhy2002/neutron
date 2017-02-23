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

public class LoanListNode extends ListUiNode<LiabilitiesNode,LoanNode>
{
    private LoanListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(LoanListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return LoanListNode.class;
    }

    private LoanListNodeComponent component;

    @Inject
    void createComponent(LoanListNodeComponent.Builder builder) {
        this.component = builder.setLoanListNodeModule(new LoanListNodeModule(this)).build();
    }

    @Override
    protected LoanListNodeRuleProvider getRuleProvider() {
        return component.getLoanListNodeRuleProvider();
    }

    public LoanListNode(LiabilitiesNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<LoanNode> getItemClass() {
        return LoanNode.class;
    }

    public NodeAddEvent<LoanNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<LoanNode> createItemRemoveEvent(LoanNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}

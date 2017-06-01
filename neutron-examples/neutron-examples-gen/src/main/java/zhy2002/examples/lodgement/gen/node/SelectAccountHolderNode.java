package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class SelectAccountHolderNode extends ObjectUiNode<SelectAccountHolderListNode<?>> {

    private SelectAccountHolderNodeChildFactory childFactory;
    private SelectAccountHolderNodeComponent component;

    @Inject
    public SelectAccountHolderNode(@Owner SelectAccountHolderListNode<?> parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SelectAccountHolderNode.class;
    }

    @Inject
    void receiveNodeProvider(SelectAccountHolderNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(SelectAccountHolderNodeComponent.Builder builder) {
        this.component = builder.setSelectAccountHolderNodeModule(new SelectAccountHolderNodeModule(this)).build();
    }

    private RuleProvider<SelectAccountHolderNode> getRuleProvider() {
        return component.getSelectAccountHolderNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }

    @JsMethod
    public AccountHolderReferenceNode getAccountHolderReferenceNode() {
        return (AccountHolderReferenceNode)getChildByName("accountHolderReferenceNode");
    }

    @JsMethod
    public SelectAccountHolderFlagNode getSelectAccountHolderFlagNode() {
        return (SelectAccountHolderFlagNode)getChildByName("selectAccountHolderFlagNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("accountHolderReferenceNode");
        children.add(childFactory.createAccountHolderReferenceNode());
        setChildNodeIdentity("selectAccountHolderFlagNode");
        children.add(childFactory.createSelectAccountHolderFlagNode());
        setChildNodeIdentity(null);
        return children;
    }

}

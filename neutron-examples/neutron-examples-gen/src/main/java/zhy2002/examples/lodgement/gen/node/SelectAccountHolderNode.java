package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class SelectAccountHolderNode extends ObjectUiNode<SelectAccountHolderListNode<?>> {

    private SelectAccountHolderNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(SelectAccountHolderNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return SelectAccountHolderNode.class;
    }

    private SelectAccountHolderNodeComponent component;

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


    public SelectAccountHolderNode(@NotNull SelectAccountHolderListNode<?> parent, String name) {
        super(parent, name);
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
        children.add(childFactory.createAccountHolderReferenceNode());
        children.add(childFactory.createSelectAccountHolderFlagNode());
        return children;
    }

}

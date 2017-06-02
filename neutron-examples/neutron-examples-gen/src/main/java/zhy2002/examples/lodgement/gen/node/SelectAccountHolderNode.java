package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SelectAccountHolderNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SelectAccountHolderNode extends ObjectUiNode<SelectAccountHolderListNode<?>> {

    @Inject
    protected SelectAccountHolderNode(@Owner SelectAccountHolderListNode<?> parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SelectAccountHolderNode.class;
    }

    protected final SelectAccountHolderNodeComponent getComponent() {
        return component;
    }


    private SelectAccountHolderNodeComponent component;

    @Inject
    void createComponent(SelectAccountHolderNodeComponent.Builder builder) {
        this.component = builder.setSelectAccountHolderNodeModule(new SelectAccountHolderNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    //region children getters

    @JsMethod
    public AccountHolderReferenceNode getAccountHolderReferenceNode() {
        return (AccountHolderReferenceNode)getChildByName("accountHolderReferenceNode");
    }

    @JsMethod
    public SelectAccountHolderFlagNode getSelectAccountHolderFlagNode() {
        return (SelectAccountHolderFlagNode)getChildByName("selectAccountHolderFlagNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("accountHolderReferenceNode");
        children.add(getComponent().createAccountHolderReferenceNode());
        setChildNodeIdentity("selectAccountHolderFlagNode");
        children.add(getComponent().createSelectAccountHolderFlagNode());
        setChildNodeIdentity(null);
        return children;
    }

}

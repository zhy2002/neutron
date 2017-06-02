package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SavingsAccountNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SavingsAccountNode extends ObjectUiNode<SavingsAccountListNode> {

    @Inject
    protected SavingsAccountNode(@Owner SavingsAccountListNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SavingsAccountNode.class;
    }

    protected final SavingsAccountNodeComponent getComponent() {
        return component;
    }


    private SavingsAccountNodeComponent component;

    @Inject
    void createComponent(SavingsAccountNodeComponent.Builder builder) {
        this.component = builder.setSavingsAccountNodeModule(new SavingsAccountNodeModule(this)).build();
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
    public SavingsTypeNode getSavingsTypeNode() {
        return (SavingsTypeNode)getChildByName("savingsTypeNode");
    }

    @JsMethod
    public SavingsInstitutionNameNode getSavingsInstitutionNameNode() {
        return (SavingsInstitutionNameNode)getChildByName("savingsInstitutionNameNode");
    }

    @JsMethod
    public SavingsBalanceNode getSavingsBalanceNode() {
        return (SavingsBalanceNode)getChildByName("savingsBalanceNode");
    }

    @JsMethod
    public SavingsBsbNoNode getSavingsBsbNoNode() {
        return (SavingsBsbNoNode)getChildByName("savingsBsbNoNode");
    }

    @JsMethod
    public SavingsAccountNoNode getSavingsAccountNoNode() {
        return (SavingsAccountNoNode)getChildByName("savingsAccountNoNode");
    }

    @JsMethod
    public SavingsAccountNameNode getSavingsAccountNameNode() {
        return (SavingsAccountNameNode)getChildByName("savingsAccountNameNode");
    }

    @JsMethod
    public SavingsOwnershipListNode getOwnershipListNode() {
        return (SavingsOwnershipListNode)getChildByName("ownershipListNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("savingsTypeNode");
        children.add(getComponent().createSavingsTypeNode());
        setChildNodeIdentity("savingsInstitutionNameNode");
        children.add(getComponent().createSavingsInstitutionNameNode());
        setChildNodeIdentity("savingsBalanceNode");
        children.add(getComponent().createSavingsBalanceNode());
        setChildNodeIdentity("savingsBsbNoNode");
        children.add(getComponent().createSavingsBsbNoNode());
        setChildNodeIdentity("savingsAccountNoNode");
        children.add(getComponent().createSavingsAccountNoNode());
        setChildNodeIdentity("savingsAccountNameNode");
        children.add(getComponent().createSavingsAccountNameNode());
        setChildNodeIdentity("ownershipListNode");
        children.add(getComponent().createSavingsOwnershipListNode());
        setChildNodeIdentity(null);
        return children;
    }

}

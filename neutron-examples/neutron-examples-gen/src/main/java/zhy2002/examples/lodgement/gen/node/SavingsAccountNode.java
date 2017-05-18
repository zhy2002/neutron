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

public class SavingsAccountNode extends ObjectUiNode<SavingsAccountListNode> {

    private SavingsAccountNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(SavingsAccountNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return SavingsAccountNode.class;
    }

    private SavingsAccountNodeComponent component;

    @Inject
    void createComponent(SavingsAccountNodeComponent.Builder builder) {
        this.component = builder.setSavingsAccountNodeModule(new SavingsAccountNodeModule(this)).build();
    }

    private RuleProvider<SavingsAccountNode> getRuleProvider() {
        return component.getSavingsAccountNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public SavingsAccountNode(@NotNull SavingsAccountListNode parent, String name) {
        super(parent, name);
    }

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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("savingsTypeNode");
        children.add(childFactory.createSavingsTypeNode());
        setChildNodeIdentity("savingsInstitutionNameNode");
        children.add(childFactory.createSavingsInstitutionNameNode());
        setChildNodeIdentity("savingsBalanceNode");
        children.add(childFactory.createSavingsBalanceNode());
        setChildNodeIdentity("savingsBsbNoNode");
        children.add(childFactory.createSavingsBsbNoNode());
        setChildNodeIdentity("savingsAccountNoNode");
        children.add(childFactory.createSavingsAccountNoNode());
        setChildNodeIdentity("savingsAccountNameNode");
        children.add(childFactory.createSavingsAccountNameNode());
        setChildNodeIdentity("ownershipListNode");
        children.add(childFactory.createOwnershipListNode());
        setChildNodeIdentity(null);
        return children;
    }

}

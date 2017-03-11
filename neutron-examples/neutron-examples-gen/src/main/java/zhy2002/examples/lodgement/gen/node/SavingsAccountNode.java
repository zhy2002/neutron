package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SavingsAccountNode extends ObjectUiNode<SavingsAccountListNode> {

    private SavingsTypeNode savingsTypeNode;
    private SavingsInstitutionNameNode savingsInstitutionNameNode;
    private SavingsBalanceNode savingsBalanceNode;
    private SavingsBsbNoNode savingsBsbNoNode;
    private SavingsAccountNoNode savingsAccountNoNode;
    private SavingsAccountNameNode savingsAccountNameNode;
    private SavingsOwnershipListNode ownershipListNode;

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

    private SavingsAccountNodeRuleProvider getRuleProvider() {
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
        return savingsTypeNode;
    }

    @JsMethod
    public SavingsInstitutionNameNode getSavingsInstitutionNameNode() {
        return savingsInstitutionNameNode;
    }

    @JsMethod
    public SavingsBalanceNode getSavingsBalanceNode() {
        return savingsBalanceNode;
    }

    @JsMethod
    public SavingsBsbNoNode getSavingsBsbNoNode() {
        return savingsBsbNoNode;
    }

    @JsMethod
    public SavingsAccountNoNode getSavingsAccountNoNode() {
        return savingsAccountNoNode;
    }

    @JsMethod
    public SavingsAccountNameNode getSavingsAccountNameNode() {
        return savingsAccountNameNode;
    }

    @JsMethod
    public SavingsOwnershipListNode getOwnershipListNode() {
        return ownershipListNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        savingsTypeNode = childFactory.createSavingsTypeNode();
        children.add(savingsTypeNode);
        savingsInstitutionNameNode = childFactory.createSavingsInstitutionNameNode();
        children.add(savingsInstitutionNameNode);
        savingsBalanceNode = childFactory.createSavingsBalanceNode();
        children.add(savingsBalanceNode);
        savingsBsbNoNode = childFactory.createSavingsBsbNoNode();
        children.add(savingsBsbNoNode);
        savingsAccountNoNode = childFactory.createSavingsAccountNoNode();
        children.add(savingsAccountNoNode);
        savingsAccountNameNode = childFactory.createSavingsAccountNameNode();
        children.add(savingsAccountNameNode);
        ownershipListNode = childFactory.createOwnershipListNode();
        children.add(ownershipListNode);
        return children;
    }

}

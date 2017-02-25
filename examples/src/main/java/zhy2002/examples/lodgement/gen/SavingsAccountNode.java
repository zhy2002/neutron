package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class SavingsAccountNode extends ObjectUiNode<SavingsAccountListNode> {

    private SavingsTypeNode savingsTypeNode;
    private SavingsInstitutionNameNode savingsInstitutionNameNode;
    private SavingsBalanceNode savingsBalanceNode;
    private SavingsBsbNoNode savingsBsbNoNode;
    private SavingsAccountNoNode savingsAccountNoNode;
    private SavingsAccountNameNode savingsAccountNameNode;
    private SavingsOwnershipListNode savingsOwnershipListNode;

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

    @Override
    protected SavingsAccountNodeRuleProvider getRuleProvider() {
        return component.getSavingsAccountNodeRuleProvider();
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
    public SavingsOwnershipListNode getSavingsOwnershipListNode() {
        return savingsOwnershipListNode;
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
        savingsOwnershipListNode = childFactory.createSavingsOwnershipListNode();
        children.add(savingsOwnershipListNode);
        return children;
    }

}

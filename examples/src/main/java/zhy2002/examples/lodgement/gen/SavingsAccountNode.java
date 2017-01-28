package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;

public  class SavingsAccountNode extends ObjectUiNode<SavingsAccountListNode>
{
    private SavingsTypeNode savingsTypeNode;
    private SavingsInstitutionNameNode savingsInstitutionNameNode;
    private SavingsBalanceNode savingsBalanceNode;
    private SavingsBsbNoNode savingsBsbNoNode;
    private SavingsAccountNoNode savingsAccountNoNode;
    private SavingsAccountNameNode savingsAccountNameNode;

    protected SavingsAccountNode(SavingsAccountListNode parent, String name) {
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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        UiNodeContext<?> context = getContext();
        savingsTypeNode = context.createChildNode(SavingsTypeNode.class, this, "savingsTypeNode");
        children.add(savingsTypeNode);
        savingsInstitutionNameNode = context.createChildNode(SavingsInstitutionNameNode.class, this, "savingsInstitutionNameNode");
        children.add(savingsInstitutionNameNode);
        savingsBalanceNode = context.createChildNode(SavingsBalanceNode.class, this, "savingsBalanceNode");
        children.add(savingsBalanceNode);
        savingsBsbNoNode = context.createChildNode(SavingsBsbNoNode.class, this, "savingsBsbNoNode");
        children.add(savingsBsbNoNode);
        savingsAccountNoNode = context.createChildNode(SavingsAccountNoNode.class, this, "savingsAccountNoNode");
        children.add(savingsAccountNoNode);
        savingsAccountNameNode = context.createChildNode(SavingsAccountNameNode.class, this, "savingsAccountNameNode");
        children.add(savingsAccountNameNode);
        return children;
    }



}

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

public class SavingsAccountNode extends ObjectUiNode<SavingsAccountListNode>
{
    private SavingsTypeNode savingsTypeNode;
    private SavingsInstitutionNameNode savingsInstitutionNameNode;
    private SavingsBalanceNode savingsBalanceNode;
    private SavingsBsbNoNode savingsBsbNoNode;
    private SavingsAccountNoNode savingsAccountNoNode;
    private SavingsAccountNameNode savingsAccountNameNode;

    private SavingsAccountNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(SavingsAccountNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    public SavingsAccountNode(SavingsAccountListNode parent, String name) {
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
        return children;
    }

}

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

public class AssetsNode extends ObjectUiNode<FinancialPositionNode>
{
    private SavingsAccountListNode savingsAccountListNode;
    private MotorVehicleListNode motorVehicleListNode;
    private OtherAssetListNode otherAssetListNode;

    private AssetsNodeChildFactory childFactory;

    @Inject
    void receiveProviders(AssetsNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void receiveClassRegistry(ClassRegistryImpl classRegistry) {
        UiNodeConfig<AssetsNode> config = classRegistry.getUiNodeConfig(AssetsNode.class, getName());
        if (config != null) {
            this.setStatusListener(new ConfigBindingNodeStatusListener<>(this, config));
        }
    }

    public AssetsNode(FinancialPositionNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public SavingsAccountListNode getSavingsAccountListNode() {
        return savingsAccountListNode;
    }

    @JsMethod
    public MotorVehicleListNode getMotorVehicleListNode() {
        return motorVehicleListNode;
    }

    @JsMethod
    public OtherAssetListNode getOtherAssetListNode() {
        return otherAssetListNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        savingsAccountListNode = childFactory.createSavingsAccountListNode();
        children.add(savingsAccountListNode);
        motorVehicleListNode = childFactory.createMotorVehicleListNode();
        children.add(motorVehicleListNode);
        otherAssetListNode = childFactory.createOtherAssetListNode();
        children.add(otherAssetListNode);
        return children;
    }



}

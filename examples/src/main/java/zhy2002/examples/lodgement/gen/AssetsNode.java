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
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class AssetsNode extends ObjectUiNode<FinancialPositionNode> {

    private SavingsAccountListNode savingsAccountListNode;
    private MotorVehicleListNode motorVehicleListNode;
    private OtherAssetListNode otherAssetListNode;

    private AssetsNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(AssetsNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return AssetsNode.class;
    }

    private AssetsNodeComponent component;

    @Inject
    void createComponent(AssetsNodeComponent.Builder builder) {
        this.component = builder.setAssetsNodeModule(new AssetsNodeModule(this)).build();
    }

    @Override
    protected AssetsNodeRuleProvider getRuleProvider() {
        return component.getAssetsNodeRuleProvider();
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

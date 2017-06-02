package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AssetsNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AssetsNode extends ObjectUiNode<FinancialPositionNode> {

    @Inject
    protected AssetsNode(@Owner FinancialPositionNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AssetsNode.class;
    }

    protected final AssetsNodeComponent getComponent() {
        return component;
    }


    private AssetsNodeComponent component;

    @Inject
    void createComponent(AssetsNodeComponent.Builder builder) {
        this.component = builder.setAssetsNodeModule(new AssetsNodeModule(this)).build();
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
    public SavingsAccountListNode getSavingsAccountListNode() {
        return (SavingsAccountListNode)getChildByName("savingsAccountListNode");
    }

    @JsMethod
    public MotorVehicleListNode getMotorVehicleListNode() {
        return (MotorVehicleListNode)getChildByName("motorVehicleListNode");
    }

    @JsMethod
    public OtherAssetListNode getOtherAssetListNode() {
        return (OtherAssetListNode)getChildByName("otherAssetListNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("savingsAccountListNode");
        children.add(getComponent().createSavingsAccountListNode());
        setChildNodeIdentity("motorVehicleListNode");
        children.add(getComponent().createMotorVehicleListNode());
        setChildNodeIdentity("otherAssetListNode");
        children.add(getComponent().createOtherAssetListNode());
        setChildNodeIdentity(null);
        return children;
    }

}

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

public class AssetsNode extends ObjectUiNode<FinancialPositionNode> {

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

    private RuleProvider<AssetsNode> getRuleProvider() {
        return component.getAssetsNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<AssetsNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public AssetsNode(@NotNull FinancialPositionNode parent, String name) {
        super(parent, name);
    }

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

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        children.add(childFactory.createSavingsAccountListNode());
        children.add(childFactory.createMotorVehicleListNode());
        children.add(childFactory.createOtherAssetListNode());
        return children;
    }

}

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

    private AssetsNodeRuleProvider getRuleProvider() {
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

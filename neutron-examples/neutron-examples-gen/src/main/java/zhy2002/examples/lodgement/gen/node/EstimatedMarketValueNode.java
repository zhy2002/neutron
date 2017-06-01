package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.EstimatedMarketValueNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class EstimatedMarketValueNode extends BigDecimalUiNode<PropertyNode> {

    @Inject
    public EstimatedMarketValueNode(@Owner PropertyNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return EstimatedMarketValueNode.class;
    }

    protected final EstimatedMarketValueNodeComponent getComponent() {
        return component;
    }


    private EstimatedMarketValueNodeComponent component;

    @Inject
    void createComponent(EstimatedMarketValueNodeComponent.Builder builder) {
        this.component = builder.setEstimatedMarketValueNodeModule(new EstimatedMarketValueNodeModule(this)).build();
    }

    private RuleProvider<EstimatedMarketValueNode> getRuleProvider() {
        return component.getEstimatedMarketValueNodeRuleProvider();
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

    private RuleProvider<EstimatedMarketValueNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

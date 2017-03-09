package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class EstimatedMarketValueNode extends BigDecimalUiNode<PropertyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return EstimatedMarketValueNode.class;
    }

    private EstimatedMarketValueNodeComponent component;

    @Inject
    void createComponent(EstimatedMarketValueNodeComponent.Builder builder) {
        this.component = builder.setEstimatedMarketValueNodeModule(new EstimatedMarketValueNodeModule(this)).build();
    }

    private EstimatedMarketValueNodeRuleProvider getRuleProvider() {
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

    public EstimatedMarketValueNode(@NotNull PropertyNode parent, String name) {
        super(parent, name);
    }

}

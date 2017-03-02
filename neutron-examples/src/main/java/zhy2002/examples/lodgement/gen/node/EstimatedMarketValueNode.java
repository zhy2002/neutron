package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected EstimatedMarketValueNodeRuleProvider getRuleProvider() {
        return component.getEstimatedMarketValueNodeRuleProvider();
    }

    public EstimatedMarketValueNode(@NotNull PropertyNode parent, String name) {
        super(parent, name);
    }

}

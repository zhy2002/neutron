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
    protected EstimatedMarketValueNode(@Owner PropertyNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}

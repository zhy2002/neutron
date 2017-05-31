package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class TrustCountryNode extends BaseCountryNode<BaseTrustNode<?>> {
    private TrustCountryNodeComponent component;

    public TrustCountryNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return TrustCountryNode.class;
    }

    @Inject
    void createComponent(TrustCountryNodeComponent.Builder builder) {
        this.component = builder.setTrustCountryNodeModule(new TrustCountryNodeModule(this)).build();
    }

    private RuleProvider<TrustCountryNode> getRuleProvider() {
        return component.getTrustCountryNodeRuleProvider();
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

    private RuleProvider<TrustCountryNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TrustCountryNode extends BaseCountryNode<BaseTrustNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return TrustCountryNode.class;
    }

    private TrustCountryNodeComponent component;

    @Inject
    void createComponent(TrustCountryNodeComponent.Builder builder) {
        this.component = builder.setTrustCountryNodeModule(new TrustCountryNodeModule(this)).build();
    }

    private TrustCountryNodeRuleProvider getRuleProvider() {
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

    public TrustCountryNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class TrustSettlorNotRequiredReasonNode extends StringUiNode<BaseTrustNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return TrustSettlorNotRequiredReasonNode.class;
    }

    private TrustSettlorNotRequiredReasonNodeComponent component;

    @Inject
    void createComponent(TrustSettlorNotRequiredReasonNodeComponent.Builder builder) {
        this.component = builder.setTrustSettlorNotRequiredReasonNodeModule(new TrustSettlorNotRequiredReasonNodeModule(this)).build();
    }

    private RuleProvider<TrustSettlorNotRequiredReasonNode> getRuleProvider() {
        return component.getTrustSettlorNotRequiredReasonNodeRuleProvider();
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

    private RuleProvider<TrustSettlorNotRequiredReasonNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public TrustSettlorNotRequiredReasonNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

}

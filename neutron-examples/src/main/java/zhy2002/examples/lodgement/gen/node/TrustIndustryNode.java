package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class TrustIndustryNode extends StringUiNode<BaseTrustNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return TrustIndustryNode.class;
    }

    private TrustIndustryNodeComponent component;

    @Inject
    void createComponent(TrustIndustryNodeComponent.Builder builder) {
        this.component = builder.setTrustIndustryNodeModule(new TrustIndustryNodeModule(this)).build();
    }

    @Override
    protected TrustIndustryNodeRuleProvider getRuleProvider() {
        return component.getTrustIndustryNodeRuleProvider();
    }

    public TrustIndustryNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

}

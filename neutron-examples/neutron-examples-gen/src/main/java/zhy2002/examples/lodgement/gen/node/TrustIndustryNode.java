package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TrustIndustryNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TrustIndustryNode extends StringUiNode<BaseTrustNode<?>> {

    @Inject
    public TrustIndustryNode(@Owner BaseTrustNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TrustIndustryNode.class;
    }

    protected final TrustIndustryNodeComponent getComponent() {
        return component;
    }


    private TrustIndustryNodeComponent component;

    @Inject
    void createComponent(TrustIndustryNodeComponent.Builder builder) {
        this.component = builder.setTrustIndustryNodeModule(new TrustIndustryNodeModule(this)).build();
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

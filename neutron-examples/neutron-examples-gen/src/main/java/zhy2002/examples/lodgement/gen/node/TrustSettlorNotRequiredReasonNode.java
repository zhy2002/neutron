package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TrustSettlorNotRequiredReasonNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TrustSettlorNotRequiredReasonNode extends StringUiNode<BaseTrustNode<?>> {

    @Inject
    protected TrustSettlorNotRequiredReasonNode(@Owner BaseTrustNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TrustSettlorNotRequiredReasonNode.class;
    }

    protected final TrustSettlorNotRequiredReasonNodeComponent getComponent() {
        return component;
    }


    private TrustSettlorNotRequiredReasonNodeComponent component;

    @Inject
    void createComponent(TrustSettlorNotRequiredReasonNodeComponent.Builder builder) {
        this.component = builder.setTrustSettlorNotRequiredReasonNodeModule(new TrustSettlorNotRequiredReasonNodeModule(this)).build();
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

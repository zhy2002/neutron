package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TrustCountryNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TrustCountryNode extends BaseCountryNode<BaseTrustNode<?>> {

    @Inject
    public TrustCountryNode(@Owner BaseTrustNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TrustCountryNode.class;
    }

    protected final TrustCountryNodeComponent getComponent() {
        return component;
    }


    private TrustCountryNodeComponent component;

    @Inject
    void createComponent(TrustCountryNodeComponent.Builder builder) {
        this.component = builder.setTrustCountryNodeModule(new TrustCountryNodeModule(this)).build();
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

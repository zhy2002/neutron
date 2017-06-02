package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TrustRegistrationDateNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TrustRegistrationDateNode extends StringUiNode<BaseTrustNode<?>> {

    @Inject
    protected TrustRegistrationDateNode(@Owner BaseTrustNode<?> parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TrustRegistrationDateNode.class;
    }

    protected final TrustRegistrationDateNodeComponent getComponent() {
        return component;
    }


    private TrustRegistrationDateNodeComponent component;

    @Inject
    void createComponent(TrustRegistrationDateNodeComponent.Builder builder) {
        this.component = builder.setTrustRegistrationDateNodeModule(new TrustRegistrationDateNodeModule(this)).build();
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

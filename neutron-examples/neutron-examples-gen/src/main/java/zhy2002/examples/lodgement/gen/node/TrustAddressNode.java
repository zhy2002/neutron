package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TrustAddressNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TrustAddressNode extends AddressNode<BaseTrustNode<?>> {

    @Inject
    public TrustAddressNode(@Owner BaseTrustNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TrustAddressNode.class;
    }

    protected final TrustAddressNodeComponent getComponent() {
        return component;
    }


    private TrustAddressNodeComponent component;

    @Inject
    void createComponent(TrustAddressNodeComponent.Builder builder) {
        this.component = builder.setTrustAddressNodeModule(new TrustAddressNodeModule(this)).build();
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

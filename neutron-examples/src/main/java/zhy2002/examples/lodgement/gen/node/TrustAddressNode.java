package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class TrustAddressNode extends AddressNode<BaseTrustNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return TrustAddressNode.class;
    }

    private TrustAddressNodeComponent component;

    @Inject
    void createComponent(TrustAddressNodeComponent.Builder builder) {
        this.component = builder.setTrustAddressNodeModule(new TrustAddressNodeModule(this)).build();
    }

    @Override
    protected TrustAddressNodeRuleProvider getRuleProvider() {
        return component.getTrustAddressNodeRuleProvider();
    }

    public TrustAddressNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

}

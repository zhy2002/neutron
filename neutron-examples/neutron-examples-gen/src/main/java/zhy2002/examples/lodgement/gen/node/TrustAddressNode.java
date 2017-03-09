package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private TrustAddressNodeRuleProvider getRuleProvider() {
        return component.getTrustAddressNodeRuleProvider();
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

    private RuleProvider<TrustAddressNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public TrustAddressNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

}

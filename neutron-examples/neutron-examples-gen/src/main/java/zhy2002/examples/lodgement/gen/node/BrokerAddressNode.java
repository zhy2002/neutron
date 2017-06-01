package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BrokerAddressNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class BrokerAddressNode extends AddressNode<SubmissionNode> {

    @Inject
    public BrokerAddressNode(@Owner SubmissionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return BrokerAddressNode.class;
    }

    protected final BrokerAddressNodeComponent getComponent() {
        return component;
    }


    private BrokerAddressNodeComponent component;

    @Inject
    void createComponent(BrokerAddressNodeComponent.Builder builder) {
        this.component = builder.setBrokerAddressNodeModule(new BrokerAddressNodeModule(this)).build();
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

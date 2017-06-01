package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class BrokerAddressNode extends AddressNode<SubmissionNode> {

    private BrokerAddressNodeComponent component;

    @Inject
    public BrokerAddressNode(@Owner SubmissionNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return BrokerAddressNode.class;
    }

    @Inject
    void createComponent(BrokerAddressNodeComponent.Builder builder) {
        this.component = builder.setBrokerAddressNodeModule(new BrokerAddressNodeModule(this)).build();
    }

    private RuleProvider<BrokerAddressNode> getRuleProvider() {
        return component.getBrokerAddressNodeRuleProvider();
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

    private RuleProvider<BrokerAddressNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

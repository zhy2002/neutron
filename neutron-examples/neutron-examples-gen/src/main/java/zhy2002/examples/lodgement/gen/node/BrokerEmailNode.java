package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BrokerEmailNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class BrokerEmailNode extends EmailNode<SubmissionNode> {

    @Inject
    public BrokerEmailNode(@Owner SubmissionNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return BrokerEmailNode.class;
    }

    protected final BrokerEmailNodeComponent getComponent() {
        return component;
    }


    private BrokerEmailNodeComponent component;

    @Inject
    void createComponent(BrokerEmailNodeComponent.Builder builder) {
        this.component = builder.setBrokerEmailNodeModule(new BrokerEmailNodeModule(this)).build();
    }

    private RuleProvider<BrokerEmailNode> getRuleProvider() {
        return component.getBrokerEmailNodeRuleProvider();
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

    private RuleProvider<BrokerEmailNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

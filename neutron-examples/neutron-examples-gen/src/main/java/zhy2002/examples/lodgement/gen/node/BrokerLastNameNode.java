package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BrokerLastNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class BrokerLastNameNode extends NameNode<SubmissionNode> {

    @Inject
    public BrokerLastNameNode(@Owner SubmissionNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return BrokerLastNameNode.class;
    }

    protected final BrokerLastNameNodeComponent getComponent() {
        return component;
    }


    private BrokerLastNameNodeComponent component;

    @Inject
    void createComponent(BrokerLastNameNodeComponent.Builder builder) {
        this.component = builder.setBrokerLastNameNodeModule(new BrokerLastNameNodeModule(this)).build();
    }

    private RuleProvider<BrokerLastNameNode> getRuleProvider() {
        return component.getBrokerLastNameNodeRuleProvider();
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

    private RuleProvider<BrokerLastNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

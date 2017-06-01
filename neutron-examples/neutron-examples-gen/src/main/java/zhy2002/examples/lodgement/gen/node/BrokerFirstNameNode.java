package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BrokerFirstNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class BrokerFirstNameNode extends NameNode<SubmissionNode> {

    @Inject
    public BrokerFirstNameNode(@Owner SubmissionNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return BrokerFirstNameNode.class;
    }

    protected final BrokerFirstNameNodeComponent getComponent() {
        return component;
    }


    private BrokerFirstNameNodeComponent component;

    @Inject
    void createComponent(BrokerFirstNameNodeComponent.Builder builder) {
        this.component = builder.setBrokerFirstNameNodeModule(new BrokerFirstNameNodeModule(this)).build();
    }

    private RuleProvider<BrokerFirstNameNode> getRuleProvider() {
        return component.getBrokerFirstNameNodeRuleProvider();
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

    private RuleProvider<BrokerFirstNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class BrokerLastNameNode extends StringUiNode<SubmissionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return BrokerLastNameNode.class;
    }

    private BrokerLastNameNodeComponent component;

    @Inject
    void createComponent(BrokerLastNameNodeComponent.Builder builder) {
        this.component = builder.setBrokerLastNameNodeModule(new BrokerLastNameNodeModule(this)).build();
    }

    private BrokerLastNameNodeRuleProvider getRuleProvider() {
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

    public BrokerLastNameNode(@NotNull SubmissionNode parent, String name) {
        super(parent, name);
    }

}

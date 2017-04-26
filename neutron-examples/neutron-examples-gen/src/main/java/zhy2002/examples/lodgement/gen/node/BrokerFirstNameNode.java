package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class BrokerFirstNameNode extends StringUiNode<SubmissionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return BrokerFirstNameNode.class;
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


    public BrokerFirstNameNode(@NotNull SubmissionNode parent, String name) {
        super(parent, name);
    }

}

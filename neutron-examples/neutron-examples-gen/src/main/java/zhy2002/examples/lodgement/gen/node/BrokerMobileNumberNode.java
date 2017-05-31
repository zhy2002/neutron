package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class BrokerMobileNumberNode extends BaseMobileNumberNode<SubmissionNode> {
    private BrokerMobileNumberNodeComponent component;

    public BrokerMobileNumberNode(@NotNull SubmissionNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return BrokerMobileNumberNode.class;
    }

    @Inject
    void createComponent(BrokerMobileNumberNodeComponent.Builder builder) {
        this.component = builder.setBrokerMobileNumberNodeModule(new BrokerMobileNumberNodeModule(this)).build();
    }

    private RuleProvider<BrokerMobileNumberNode> getRuleProvider() {
        return component.getBrokerMobileNumberNodeRuleProvider();
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

    private RuleProvider<BrokerMobileNumberNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

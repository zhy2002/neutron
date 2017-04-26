package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class BrokerTelephoneNode extends TelephoneNode<SubmissionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return BrokerTelephoneNode.class;
    }

    private BrokerTelephoneNodeComponent component;

    @Inject
    void createComponent(BrokerTelephoneNodeComponent.Builder builder) {
        this.component = builder.setBrokerTelephoneNodeModule(new BrokerTelephoneNodeModule(this)).build();
    }

    private RuleProvider<BrokerTelephoneNode> getRuleProvider() {
        return component.getBrokerTelephoneNodeRuleProvider();
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

    private RuleProvider<BrokerTelephoneNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public BrokerTelephoneNode(@NotNull SubmissionNode parent, String name) {
        super(parent, name);
    }

}

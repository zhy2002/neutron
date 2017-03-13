package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class LenderIssuedBrokerNumberNode extends StringUiNode<SubmissionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return LenderIssuedBrokerNumberNode.class;
    }

    private LenderIssuedBrokerNumberNodeComponent component;

    @Inject
    void createComponent(LenderIssuedBrokerNumberNodeComponent.Builder builder) {
        this.component = builder.setLenderIssuedBrokerNumberNodeModule(new LenderIssuedBrokerNumberNodeModule(this)).build();
    }

    private LenderIssuedBrokerNumberNodeRuleProvider getRuleProvider() {
        return component.getLenderIssuedBrokerNumberNodeRuleProvider();
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

    private RuleProvider<LenderIssuedBrokerNumberNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public LenderIssuedBrokerNumberNode(@NotNull SubmissionNode parent, String name) {
        super(parent, name);
    }

}

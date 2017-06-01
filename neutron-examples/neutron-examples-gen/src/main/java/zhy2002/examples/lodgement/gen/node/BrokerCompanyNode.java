package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.BrokerCompanyNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class BrokerCompanyNode extends StringUiNode<SubmissionNode> {

    @Inject
    public BrokerCompanyNode(@Owner SubmissionNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return BrokerCompanyNode.class;
    }

    protected final BrokerCompanyNodeComponent getComponent() {
        return component;
    }


    private BrokerCompanyNodeComponent component;

    @Inject
    void createComponent(BrokerCompanyNodeComponent.Builder builder) {
        this.component = builder.setBrokerCompanyNodeModule(new BrokerCompanyNodeModule(this)).build();
    }

    private RuleProvider<BrokerCompanyNode> getRuleProvider() {
        return component.getBrokerCompanyNodeRuleProvider();
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

    private RuleProvider<BrokerCompanyNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

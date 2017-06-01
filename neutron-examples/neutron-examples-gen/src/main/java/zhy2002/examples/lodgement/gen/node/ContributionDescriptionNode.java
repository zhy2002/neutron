package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ContributionDescriptionNode extends StringUiNode<ProductCustomerContributionNode> {

    private ContributionDescriptionNodeComponent component;

    @Inject
    public ContributionDescriptionNode(@Owner ProductCustomerContributionNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ContributionDescriptionNode.class;
    }

    @Inject
    void createComponent(ContributionDescriptionNodeComponent.Builder builder) {
        this.component = builder.setContributionDescriptionNodeModule(new ContributionDescriptionNodeModule(this)).build();
    }

    private RuleProvider<ContributionDescriptionNode> getRuleProvider() {
        return component.getContributionDescriptionNodeRuleProvider();
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

    private RuleProvider<ContributionDescriptionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ContributionDescriptionNode extends StringUiNode<ProductCustomerContributionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ContributionDescriptionNode.class;
    }

    private ContributionDescriptionNodeComponent component;

    @Inject
    void createComponent(ContributionDescriptionNodeComponent.Builder builder) {
        this.component = builder.setContributionDescriptionNodeModule(new ContributionDescriptionNodeModule(this)).build();
    }

    private ContributionDescriptionNodeRuleProvider getRuleProvider() {
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

    public ContributionDescriptionNode(@NotNull ProductCustomerContributionNode parent, String name) {
        super(parent, name);
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ContributionTypeNode extends StringUiNode<ProductCustomerContributionNode> {
    private ContributionTypeNodeComponent component;

    public ContributionTypeNode(@NotNull ProductCustomerContributionNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return ContributionTypeNode.class;
    }

    @Inject
    void createComponent(ContributionTypeNodeComponent.Builder builder) {
        this.component = builder.setContributionTypeNodeModule(new ContributionTypeNodeModule(this)).build();
    }

    private RuleProvider<ContributionTypeNode> getRuleProvider() {
        return component.getContributionTypeNodeRuleProvider();
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

    private RuleProvider<ContributionTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

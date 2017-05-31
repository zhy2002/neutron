package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class SavingsAccountNoNode extends StringUiNode<SavingsAccountNode> {
    private SavingsAccountNoNodeComponent component;

    public SavingsAccountNoNode(@NotNull SavingsAccountNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return SavingsAccountNoNode.class;
    }

    @Inject
    void createComponent(SavingsAccountNoNodeComponent.Builder builder) {
        this.component = builder.setSavingsAccountNoNodeModule(new SavingsAccountNoNodeModule(this)).build();
    }

    private RuleProvider<SavingsAccountNoNode> getRuleProvider() {
        return component.getSavingsAccountNoNodeRuleProvider();
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

    private RuleProvider<SavingsAccountNoNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class SavingsBsbNoNode extends StringUiNode<SavingsAccountNode> {
    private SavingsBsbNoNodeComponent component;

    public SavingsBsbNoNode(@NotNull SavingsAccountNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return SavingsBsbNoNode.class;
    }

    @Inject
    void createComponent(SavingsBsbNoNodeComponent.Builder builder) {
        this.component = builder.setSavingsBsbNoNodeModule(new SavingsBsbNoNodeModule(this)).build();
    }

    private RuleProvider<SavingsBsbNoNode> getRuleProvider() {
        return component.getSavingsBsbNoNodeRuleProvider();
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

    private RuleProvider<SavingsBsbNoNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

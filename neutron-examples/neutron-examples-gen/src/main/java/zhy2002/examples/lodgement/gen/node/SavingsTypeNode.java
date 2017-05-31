package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class SavingsTypeNode extends StringUiNode<SavingsAccountNode> {
    private SavingsTypeNodeComponent component;

    public SavingsTypeNode(@NotNull SavingsAccountNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return SavingsTypeNode.class;
    }

    @Inject
    void createComponent(SavingsTypeNodeComponent.Builder builder) {
        this.component = builder.setSavingsTypeNodeModule(new SavingsTypeNodeModule(this)).build();
    }

    private RuleProvider<SavingsTypeNode> getRuleProvider() {
        return component.getSavingsTypeNodeRuleProvider();
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

    private RuleProvider<SavingsTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

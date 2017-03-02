package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class SavingsAccountNoNode extends StringUiNode<SavingsAccountNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return SavingsAccountNoNode.class;
    }

    private SavingsAccountNoNodeComponent component;

    @Inject
    void createComponent(SavingsAccountNoNodeComponent.Builder builder) {
        this.component = builder.setSavingsAccountNoNodeModule(new SavingsAccountNoNodeModule(this)).build();
    }

    @Override
    protected SavingsAccountNoNodeRuleProvider getRuleProvider() {
        return component.getSavingsAccountNoNodeRuleProvider();
    }

    public SavingsAccountNoNode(@NotNull SavingsAccountNode parent, String name) {
        super(parent, name);
    }

}

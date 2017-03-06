package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private SavingsAccountNoNodeRuleProvider getRuleProvider() {
        return component.getSavingsAccountNoNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public SavingsAccountNoNode(@NotNull SavingsAccountNode parent, String name) {
        super(parent, name);
    }

}

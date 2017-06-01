package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SavingsAccountNoNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SavingsAccountNoNode extends StringUiNode<SavingsAccountNode> {

    @Inject
    public SavingsAccountNoNode(@Owner SavingsAccountNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SavingsAccountNoNode.class;
    }

    protected final SavingsAccountNoNodeComponent getComponent() {
        return component;
    }


    private SavingsAccountNoNodeComponent component;

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

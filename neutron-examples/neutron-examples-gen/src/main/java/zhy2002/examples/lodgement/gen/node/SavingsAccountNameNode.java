package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SavingsAccountNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class SavingsAccountNameNode extends StringUiNode<SavingsAccountNode> {

    @Inject
    public SavingsAccountNameNode(@Owner SavingsAccountNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SavingsAccountNameNode.class;
    }

    protected final SavingsAccountNameNodeComponent getComponent() {
        return component;
    }


    private SavingsAccountNameNodeComponent component;

    @Inject
    void createComponent(SavingsAccountNameNodeComponent.Builder builder) {
        this.component = builder.setSavingsAccountNameNodeModule(new SavingsAccountNameNodeModule(this)).build();
    }

    private RuleProvider<SavingsAccountNameNode> getRuleProvider() {
        return component.getSavingsAccountNameNodeRuleProvider();
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

    private RuleProvider<SavingsAccountNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

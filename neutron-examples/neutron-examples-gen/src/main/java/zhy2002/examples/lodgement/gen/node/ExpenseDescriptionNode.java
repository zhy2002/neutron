package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ExpenseDescriptionNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ExpenseDescriptionNode extends StringUiNode<ExpenseNode> {

    @Inject
    public ExpenseDescriptionNode(@Owner ExpenseNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ExpenseDescriptionNode.class;
    }

    protected final ExpenseDescriptionNodeComponent getComponent() {
        return component;
    }


    private ExpenseDescriptionNodeComponent component;

    @Inject
    void createComponent(ExpenseDescriptionNodeComponent.Builder builder) {
        this.component = builder.setExpenseDescriptionNodeModule(new ExpenseDescriptionNodeModule(this)).build();
    }

    private RuleProvider<ExpenseDescriptionNode> getRuleProvider() {
        return component.getExpenseDescriptionNodeRuleProvider();
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

    private RuleProvider<ExpenseDescriptionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

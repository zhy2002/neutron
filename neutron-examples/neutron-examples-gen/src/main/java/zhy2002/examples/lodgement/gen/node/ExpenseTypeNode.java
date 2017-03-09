package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ExpenseTypeNode extends StringUiNode<ExpenseNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ExpenseTypeNode.class;
    }

    private ExpenseTypeNodeComponent component;

    @Inject
    void createComponent(ExpenseTypeNodeComponent.Builder builder) {
        this.component = builder.setExpenseTypeNodeModule(new ExpenseTypeNodeModule(this)).build();
    }

    private ExpenseTypeNodeRuleProvider getRuleProvider() {
        return component.getExpenseTypeNodeRuleProvider();
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

    private RuleProvider<ExpenseTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public ExpenseTypeNode(@NotNull ExpenseNode parent, String name) {
        super(parent, name);
    }

}

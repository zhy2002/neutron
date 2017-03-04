package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected ExpenseTypeNodeRuleProvider getRuleProvider() {
        return component.getExpenseTypeNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public ExpenseTypeNode(@NotNull ExpenseNode parent, String name) {
        super(parent, name);
    }

}

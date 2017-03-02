package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class ExpenseDescriptionNode extends StringUiNode<ExpenseNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return ExpenseDescriptionNode.class;
    }

    private ExpenseDescriptionNodeComponent component;

    @Inject
    void createComponent(ExpenseDescriptionNodeComponent.Builder builder) {
        this.component = builder.setExpenseDescriptionNodeModule(new ExpenseDescriptionNodeModule(this)).build();
    }

    @Override
    protected ExpenseDescriptionNodeRuleProvider getRuleProvider() {
        return component.getExpenseDescriptionNodeRuleProvider();
    }

    public ExpenseDescriptionNode(@NotNull ExpenseNode parent, String name) {
        super(parent, name);
    }

}

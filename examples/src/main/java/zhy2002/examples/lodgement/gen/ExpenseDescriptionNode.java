package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class ExpenseDescriptionNode extends StringUiNode<ExpenseNode>
{
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

    public ExpenseDescriptionNode(ExpenseNode parent, String name) {
        super(parent, name);
    }

}

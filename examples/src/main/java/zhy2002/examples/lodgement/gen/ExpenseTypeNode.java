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

public class ExpenseTypeNode extends StringUiNode<ExpenseNode>
{
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

    public ExpenseTypeNode(ExpenseNode parent, String name) {
        super(parent, name);
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ExpenseTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ExpenseTypeNode extends StringUiNode<ExpenseNode> {

    @Inject
    public ExpenseTypeNode(@Owner ExpenseNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ExpenseTypeNode.class;
    }

    protected final ExpenseTypeNodeComponent getComponent() {
        return component;
    }


    private ExpenseTypeNodeComponent component;

    @Inject
    void createComponent(ExpenseTypeNodeComponent.Builder builder) {
        this.component = builder.setExpenseTypeNodeModule(new ExpenseTypeNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}

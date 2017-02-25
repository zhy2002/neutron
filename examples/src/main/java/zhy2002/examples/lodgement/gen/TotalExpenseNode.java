package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class TotalExpenseNode extends BaseCurrencyNode<FinancialPositionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return TotalExpenseNode.class;
    }

    private TotalExpenseNodeComponent component;

    @Inject
    void createComponent(TotalExpenseNodeComponent.Builder builder) {
        this.component = builder.setTotalExpenseNodeModule(new TotalExpenseNodeModule(this)).build();
    }

    @Override
    protected TotalExpenseNodeRuleProvider getRuleProvider() {
        return component.getTotalExpenseNodeRuleProvider();
    }

    public TotalExpenseNode(@NotNull FinancialPositionNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setMinValue(new BigDecimal("0"));
    }

}

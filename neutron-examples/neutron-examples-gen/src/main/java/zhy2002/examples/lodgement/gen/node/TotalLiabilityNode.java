package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class TotalLiabilityNode extends BaseCurrencyNode<FinancialPositionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return TotalLiabilityNode.class;
    }

    private TotalLiabilityNodeComponent component;

    @Inject
    void createComponent(TotalLiabilityNodeComponent.Builder builder) {
        this.component = builder.setTotalLiabilityNodeModule(new TotalLiabilityNodeModule(this)).build();
    }

    @Override
    protected TotalLiabilityNodeRuleProvider getRuleProvider() {
        return component.getTotalLiabilityNodeRuleProvider();
    }

    public TotalLiabilityNode(@NotNull FinancialPositionNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setMinValue(new BigDecimal("0"));
    }

}
package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class TotalAssetNode extends BaseCurrencyNode<FinancialPositionNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return TotalAssetNode.class;
    }

    private TotalAssetNodeComponent component;

    @Inject
    void createComponent(TotalAssetNodeComponent.Builder builder) {
        this.component = builder.setTotalAssetNodeModule(new TotalAssetNodeModule(this)).build();
    }

    @Override
    protected TotalAssetNodeRuleProvider getRuleProvider() {
        return component.getTotalAssetNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public TotalAssetNode(@NotNull FinancialPositionNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setMinValue(new BigDecimal("0"));
    }

}

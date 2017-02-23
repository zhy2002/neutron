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

public class TotalAssetNode extends BaseCurrencyNode<FinancialPositionNode>
{
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

    public TotalAssetNode(FinancialPositionNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setMinValue(new BigDecimal("0"));
    }

}

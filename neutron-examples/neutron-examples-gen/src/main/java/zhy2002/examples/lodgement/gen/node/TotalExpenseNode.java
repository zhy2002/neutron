package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TotalExpenseNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TotalExpenseNode extends BaseCurrencyNode<FinancialPositionNode> {

    @Inject
    protected TotalExpenseNode(@Owner FinancialPositionNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TotalExpenseNode.class;
    }

    protected final TotalExpenseNodeComponent getComponent() {
        return component;
    }


    private TotalExpenseNodeComponent component;

    @Inject
    void createComponent(TotalExpenseNodeComponent.Builder builder) {
        this.component = builder.setTotalExpenseNodeModule(new TotalExpenseNodeModule(this)).build();
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

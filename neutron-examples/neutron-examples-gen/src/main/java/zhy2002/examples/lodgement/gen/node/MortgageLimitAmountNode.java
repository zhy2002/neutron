package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MortgageLimitAmountNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MortgageLimitAmountNode extends BaseCurrencyNode<ExistingMortgageNode> {

    @Inject
    protected MortgageLimitAmountNode(@Owner ExistingMortgageNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MortgageLimitAmountNode.class;
    }

    protected final MortgageLimitAmountNodeComponent getComponent() {
        return component;
    }


    private MortgageLimitAmountNodeComponent component;

    @Inject
    void createComponent(MortgageLimitAmountNodeComponent.Builder builder) {
        this.component = builder.setMortgageLimitAmountNodeModule(new MortgageLimitAmountNodeModule(this)).build();
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

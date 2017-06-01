package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.MortgqageUnpaidBalanceNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class MortgqageUnpaidBalanceNode extends BaseCurrencyNode<ExistingMortgageNode> {

    @Inject
    public MortgqageUnpaidBalanceNode(@Owner ExistingMortgageNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MortgqageUnpaidBalanceNode.class;
    }

    protected final MortgqageUnpaidBalanceNodeComponent getComponent() {
        return component;
    }


    private MortgqageUnpaidBalanceNodeComponent component;

    @Inject
    void createComponent(MortgqageUnpaidBalanceNodeComponent.Builder builder) {
        this.component = builder.setMortgqageUnpaidBalanceNodeModule(new MortgqageUnpaidBalanceNodeModule(this)).build();
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

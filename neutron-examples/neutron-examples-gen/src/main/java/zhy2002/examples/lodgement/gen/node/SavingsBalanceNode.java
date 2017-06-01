package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.SavingsBalanceNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class SavingsBalanceNode extends BaseCurrencyNode<SavingsAccountNode> {

    @Inject
    public SavingsBalanceNode(@Owner SavingsAccountNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SavingsBalanceNode.class;
    }

    protected final SavingsBalanceNodeComponent getComponent() {
        return component;
    }


    private SavingsBalanceNodeComponent component;

    @Inject
    void createComponent(SavingsBalanceNodeComponent.Builder builder) {
        this.component = builder.setSavingsBalanceNodeModule(new SavingsBalanceNodeModule(this)).build();
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

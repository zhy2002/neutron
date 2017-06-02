package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProfitPreviousYearNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProfitPreviousYearNode extends BigDecimalUiNode<SelfEmployedNode> {

    @Inject
    protected ProfitPreviousYearNode(@Owner SelfEmployedNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProfitPreviousYearNode.class;
    }

    protected final ProfitPreviousYearNodeComponent getComponent() {
        return component;
    }


    private ProfitPreviousYearNodeComponent component;

    @Inject
    void createComponent(ProfitPreviousYearNodeComponent.Builder builder) {
        this.component = builder.setProfitPreviousYearNodeModule(new ProfitPreviousYearNodeModule(this)).build();
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

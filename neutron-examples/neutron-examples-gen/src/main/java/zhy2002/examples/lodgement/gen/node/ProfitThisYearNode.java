package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ProfitThisYearNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ProfitThisYearNode extends BigDecimalUiNode<SelfEmployedNode> {

    @Inject
    protected ProfitThisYearNode(@Owner SelfEmployedNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ProfitThisYearNode.class;
    }

    protected final ProfitThisYearNodeComponent getComponent() {
        return component;
    }


    private ProfitThisYearNodeComponent component;

    @Inject
    void createComponent(ProfitThisYearNodeComponent.Builder builder) {
        this.component = builder.setProfitThisYearNodeModule(new ProfitThisYearNodeModule(this)).build();
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

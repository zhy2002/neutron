package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityBreakCostNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherLiabilityBreakCostNode extends BaseCurrencyNode<OtherLiabilityNode> {

    @Inject
    public OtherLiabilityBreakCostNode(@Owner OtherLiabilityNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherLiabilityBreakCostNode.class;
    }

    protected final OtherLiabilityBreakCostNodeComponent getComponent() {
        return component;
    }


    private OtherLiabilityBreakCostNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityBreakCostNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityBreakCostNodeModule(new OtherLiabilityBreakCostNodeModule(this)).build();
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

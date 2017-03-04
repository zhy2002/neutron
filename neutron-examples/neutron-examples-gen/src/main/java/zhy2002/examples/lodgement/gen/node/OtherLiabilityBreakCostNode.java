package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class OtherLiabilityBreakCostNode extends BaseCurrencyNode<OtherLiabilityNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherLiabilityBreakCostNode.class;
    }

    private OtherLiabilityBreakCostNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityBreakCostNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityBreakCostNodeModule(new OtherLiabilityBreakCostNodeModule(this)).build();
    }

    @Override
    protected OtherLiabilityBreakCostNodeRuleProvider getRuleProvider() {
        return component.getOtherLiabilityBreakCostNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public OtherLiabilityBreakCostNode(@NotNull OtherLiabilityNode parent, String name) {
        super(parent, name);
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityMonthlyRepaymentNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherLiabilityMonthlyRepaymentNode extends BaseCurrencyNode<OtherLiabilityNode> {

    @Inject
    protected OtherLiabilityMonthlyRepaymentNode(@Owner OtherLiabilityNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherLiabilityMonthlyRepaymentNode.class;
    }

    protected final OtherLiabilityMonthlyRepaymentNodeComponent getComponent() {
        return component;
    }


    private OtherLiabilityMonthlyRepaymentNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityMonthlyRepaymentNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityMonthlyRepaymentNodeModule(new OtherLiabilityMonthlyRepaymentNodeModule(this)).build();
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

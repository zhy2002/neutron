package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TrustBeneficiaryListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TrustBeneficiaryListNode extends SelectRelatedPersonListNode<BaseTrustNode<?>> {

    @Inject
    protected TrustBeneficiaryListNode(@Owner BaseTrustNode<?> parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TrustBeneficiaryListNode.class;
    }

    protected final TrustBeneficiaryListNodeComponent getComponent() {
        return component;
    }


    private TrustBeneficiaryListNodeComponent component;

    @Inject
    void createComponent(TrustBeneficiaryListNodeComponent.Builder builder) {
        this.component = builder.setTrustBeneficiaryListNodeModule(new TrustBeneficiaryListNodeModule(this)).build();
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

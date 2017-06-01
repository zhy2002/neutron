package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TrustBeneficialOwnerListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TrustBeneficialOwnerListNode extends SelectRelatedPersonListNode<BaseTrustNode<?>> {

    @Inject
    public TrustBeneficialOwnerListNode(@Owner BaseTrustNode<?> parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TrustBeneficialOwnerListNode.class;
    }

    protected final TrustBeneficialOwnerListNodeComponent getComponent() {
        return component;
    }


    private TrustBeneficialOwnerListNodeComponent component;

    @Inject
    void createComponent(TrustBeneficialOwnerListNodeComponent.Builder builder) {
        this.component = builder.setTrustBeneficialOwnerListNodeModule(new TrustBeneficialOwnerListNodeModule(this)).build();
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

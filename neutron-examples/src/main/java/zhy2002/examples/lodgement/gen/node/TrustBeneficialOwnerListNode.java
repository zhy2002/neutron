package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class TrustBeneficialOwnerListNode extends SelectAccountHolderListNode<BaseTrustNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return TrustBeneficialOwnerListNode.class;
    }

    private TrustBeneficialOwnerListNodeComponent component;

    @Inject
    void createComponent(TrustBeneficialOwnerListNodeComponent.Builder builder) {
        this.component = builder.setTrustBeneficialOwnerListNodeModule(new TrustBeneficialOwnerListNodeModule(this)).build();
    }

    @Override
    protected TrustBeneficialOwnerListNodeRuleProvider getRuleProvider() {
        return component.getTrustBeneficialOwnerListNodeRuleProvider();
    }

    public TrustBeneficialOwnerListNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

}

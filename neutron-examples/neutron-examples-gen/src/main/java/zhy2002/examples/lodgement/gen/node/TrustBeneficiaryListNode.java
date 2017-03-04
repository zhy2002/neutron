package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class TrustBeneficiaryListNode extends SelectAccountHolderListNode<BaseTrustNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return TrustBeneficiaryListNode.class;
    }

    private TrustBeneficiaryListNodeComponent component;

    @Inject
    void createComponent(TrustBeneficiaryListNodeComponent.Builder builder) {
        this.component = builder.setTrustBeneficiaryListNodeModule(new TrustBeneficiaryListNodeModule(this)).build();
    }

    @Override
    protected TrustBeneficiaryListNodeRuleProvider getRuleProvider() {
        return component.getTrustBeneficiaryListNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public TrustBeneficiaryListNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

}

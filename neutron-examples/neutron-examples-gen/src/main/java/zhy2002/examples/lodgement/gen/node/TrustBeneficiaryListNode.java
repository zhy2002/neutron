package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private TrustBeneficiaryListNodeRuleProvider getRuleProvider() {
        return component.getTrustBeneficiaryListNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public TrustBeneficiaryListNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

}

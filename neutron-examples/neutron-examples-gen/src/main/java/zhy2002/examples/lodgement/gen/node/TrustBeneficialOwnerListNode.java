package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private TrustBeneficialOwnerListNodeRuleProvider getRuleProvider() {
        return component.getTrustBeneficialOwnerListNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<TrustBeneficialOwnerListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public TrustBeneficialOwnerListNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

}

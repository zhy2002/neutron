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

    private RuleProvider<TrustBeneficialOwnerListNode> getRuleProvider() {
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

}

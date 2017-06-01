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
    public TrustBeneficiaryListNode(@Owner BaseTrustNode<?> parent, @ChildName String name) {
        super(parent, name);
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

    private RuleProvider<TrustBeneficiaryListNode> getRuleProvider() {
        return component.getTrustBeneficiaryListNodeRuleProvider();
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

    private RuleProvider<TrustBeneficiaryListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

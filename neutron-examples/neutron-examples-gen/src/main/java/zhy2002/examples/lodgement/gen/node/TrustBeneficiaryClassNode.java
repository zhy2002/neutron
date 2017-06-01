package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TrustBeneficiaryClassNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TrustBeneficiaryClassNode extends StringUiNode<TrustBeneficiaryClassListNode> {

    @Inject
    public TrustBeneficiaryClassNode(@Owner TrustBeneficiaryClassListNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TrustBeneficiaryClassNode.class;
    }

    protected final TrustBeneficiaryClassNodeComponent getComponent() {
        return component;
    }


    private TrustBeneficiaryClassNodeComponent component;

    @Inject
    void createComponent(TrustBeneficiaryClassNodeComponent.Builder builder) {
        this.component = builder.setTrustBeneficiaryClassNodeModule(new TrustBeneficiaryClassNodeModule(this)).build();
    }

    private RuleProvider<TrustBeneficiaryClassNode> getRuleProvider() {
        return component.getTrustBeneficiaryClassNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }

}

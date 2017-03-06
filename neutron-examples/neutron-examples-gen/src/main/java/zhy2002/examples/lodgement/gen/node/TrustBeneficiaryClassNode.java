package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TrustBeneficiaryClassNode extends StringUiNode<TrustBeneficiaryClassListNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return TrustBeneficiaryClassNode.class;
    }

    private TrustBeneficiaryClassNodeComponent component;

    @Inject
    void createComponent(TrustBeneficiaryClassNodeComponent.Builder builder) {
        this.component = builder.setTrustBeneficiaryClassNodeModule(new TrustBeneficiaryClassNodeModule(this)).build();
    }

    private TrustBeneficiaryClassNodeRuleProvider getRuleProvider() {
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


    public TrustBeneficiaryClassNode(@NotNull TrustBeneficiaryClassListNode parent, String name) {
        super(parent, name);
    }

}

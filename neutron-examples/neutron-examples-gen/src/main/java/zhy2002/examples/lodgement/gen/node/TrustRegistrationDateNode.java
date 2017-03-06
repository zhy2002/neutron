package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TrustRegistrationDateNode extends StringUiNode<BaseTrustNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return TrustRegistrationDateNode.class;
    }

    private TrustRegistrationDateNodeComponent component;

    @Inject
    void createComponent(TrustRegistrationDateNodeComponent.Builder builder) {
        this.component = builder.setTrustRegistrationDateNodeModule(new TrustRegistrationDateNodeModule(this)).build();
    }

    private TrustRegistrationDateNodeRuleProvider getRuleProvider() {
        return component.getTrustRegistrationDateNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public TrustRegistrationDateNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

}

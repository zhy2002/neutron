package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class TrustNameNode extends StringUiNode<BaseTrustNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return TrustNameNode.class;
    }

    private TrustNameNodeComponent component;

    @Inject
    void createComponent(TrustNameNodeComponent.Builder builder) {
        this.component = builder.setTrustNameNodeModule(new TrustNameNodeModule(this)).build();
    }

    @Override
    protected TrustNameNodeRuleProvider getRuleProvider() {
        return component.getTrustNameNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public TrustNameNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

}

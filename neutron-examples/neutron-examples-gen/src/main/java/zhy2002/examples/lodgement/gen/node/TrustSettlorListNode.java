package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class TrustSettlorListNode extends SelectAccountHolderListNode<BaseTrustNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return TrustSettlorListNode.class;
    }

    private TrustSettlorListNodeComponent component;

    @Inject
    void createComponent(TrustSettlorListNodeComponent.Builder builder) {
        this.component = builder.setTrustSettlorListNodeModule(new TrustSettlorListNodeModule(this)).build();
    }

    @Override
    protected TrustSettlorListNodeRuleProvider getRuleProvider() {
        return component.getTrustSettlorListNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public TrustSettlorListNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class TrustCountryNode extends BaseCountryNode<BaseTrustNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return TrustCountryNode.class;
    }

    private TrustCountryNodeComponent component;

    @Inject
    void createComponent(TrustCountryNodeComponent.Builder builder) {
        this.component = builder.setTrustCountryNodeModule(new TrustCountryNodeModule(this)).build();
    }

    @Override
    protected TrustCountryNodeRuleProvider getRuleProvider() {
        return component.getTrustCountryNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public TrustCountryNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}

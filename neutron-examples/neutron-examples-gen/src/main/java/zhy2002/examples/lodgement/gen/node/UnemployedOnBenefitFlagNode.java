package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.UnemployedOnBenefitFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class UnemployedOnBenefitFlagNode extends YesNoOptionNode<UnemployedNode> {

    @Inject
    protected UnemployedOnBenefitFlagNode(@Owner UnemployedNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return UnemployedOnBenefitFlagNode.class;
    }

    protected final UnemployedOnBenefitFlagNodeComponent getComponent() {
        return component;
    }


    private UnemployedOnBenefitFlagNodeComponent component;

    @Inject
    void createComponent(UnemployedOnBenefitFlagNodeComponent.Builder builder) {
        this.component = builder.setUnemployedOnBenefitFlagNodeModule(new UnemployedOnBenefitFlagNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}

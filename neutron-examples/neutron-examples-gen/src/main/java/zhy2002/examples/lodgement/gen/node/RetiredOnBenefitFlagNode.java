package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.RetiredOnBenefitFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class RetiredOnBenefitFlagNode extends YesNoOptionNode<RetiredEmploymentNode> {

    @Inject
    protected RetiredOnBenefitFlagNode(@Owner RetiredEmploymentNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return RetiredOnBenefitFlagNode.class;
    }

    protected final RetiredOnBenefitFlagNodeComponent getComponent() {
        return component;
    }


    private RetiredOnBenefitFlagNodeComponent component;

    @Inject
    void createComponent(RetiredOnBenefitFlagNodeComponent.Builder builder) {
        this.component = builder.setRetiredOnBenefitFlagNodeModule(new RetiredOnBenefitFlagNodeModule(this)).build();
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

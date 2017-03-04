package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class UnemployedOnBenefitFlagNode extends YesNoOptionNode<UnemployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return UnemployedOnBenefitFlagNode.class;
    }

    private UnemployedOnBenefitFlagNodeComponent component;

    @Inject
    void createComponent(UnemployedOnBenefitFlagNodeComponent.Builder builder) {
        this.component = builder.setUnemployedOnBenefitFlagNodeModule(new UnemployedOnBenefitFlagNodeModule(this)).build();
    }

    @Override
    protected UnemployedOnBenefitFlagNodeRuleProvider getRuleProvider() {
        return component.getUnemployedOnBenefitFlagNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public UnemployedOnBenefitFlagNode(@NotNull UnemployedNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class RetiredOnBenefitFlagNode extends YesNoOptionNode<RetiredEmploymentNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return RetiredOnBenefitFlagNode.class;
    }

    private RetiredOnBenefitFlagNodeComponent component;

    @Inject
    void createComponent(RetiredOnBenefitFlagNodeComponent.Builder builder) {
        this.component = builder.setRetiredOnBenefitFlagNodeModule(new RetiredOnBenefitFlagNodeModule(this)).build();
    }

    @Override
    protected RetiredOnBenefitFlagNodeRuleProvider getRuleProvider() {
        return component.getRetiredOnBenefitFlagNodeRuleProvider();
    }

    public RetiredOnBenefitFlagNode(@NotNull RetiredEmploymentNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}

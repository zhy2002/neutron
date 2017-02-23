package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class RetiredOnBenefitFlagNode extends YesNoOptionNode<RetiredEmploymentNode>
{
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

    public RetiredOnBenefitFlagNode(RetiredEmploymentNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
    }

}

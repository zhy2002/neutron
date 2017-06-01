package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class RetiredOnBenefitFlagNode extends YesNoOptionNode<RetiredEmploymentNode> {

    private RetiredOnBenefitFlagNodeComponent component;

    @Inject
    public RetiredOnBenefitFlagNode(@Owner RetiredEmploymentNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return RetiredOnBenefitFlagNode.class;
    }

    @Inject
    void createComponent(RetiredOnBenefitFlagNodeComponent.Builder builder) {
        this.component = builder.setRetiredOnBenefitFlagNodeModule(new RetiredOnBenefitFlagNodeModule(this)).build();
    }

    private RuleProvider<RetiredOnBenefitFlagNode> getRuleProvider() {
        return component.getRetiredOnBenefitFlagNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<RetiredOnBenefitFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

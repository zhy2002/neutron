package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private UnemployedOnBenefitFlagNodeRuleProvider getRuleProvider() {
        return component.getUnemployedOnBenefitFlagNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public UnemployedOnBenefitFlagNode(@NotNull UnemployedNode parent, String name) {
        super(parent, name);
    }

}

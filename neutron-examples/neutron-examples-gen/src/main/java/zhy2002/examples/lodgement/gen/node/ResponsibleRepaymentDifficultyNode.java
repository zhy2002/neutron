package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ResponsibleRepaymentDifficultyNode extends YesNoOptionNode<BaseResponsibleLendNode<?>> {

    private ResponsibleRepaymentDifficultyNodeComponent component;

    @Inject
    public ResponsibleRepaymentDifficultyNode(@Owner BaseResponsibleLendNode<?> parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ResponsibleRepaymentDifficultyNode.class;
    }

    @Inject
    void createComponent(ResponsibleRepaymentDifficultyNodeComponent.Builder builder) {
        this.component = builder.setResponsibleRepaymentDifficultyNodeModule(new ResponsibleRepaymentDifficultyNodeModule(this)).build();
    }

    private RuleProvider<ResponsibleRepaymentDifficultyNode> getRuleProvider() {
        return component.getResponsibleRepaymentDifficultyNodeRuleProvider();
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

    private RuleProvider<ResponsibleRepaymentDifficultyNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

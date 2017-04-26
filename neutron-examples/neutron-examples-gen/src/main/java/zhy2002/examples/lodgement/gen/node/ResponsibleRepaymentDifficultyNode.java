package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ResponsibleRepaymentDifficultyNode extends YesNoOptionNode<BaseResponsibleLendNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return ResponsibleRepaymentDifficultyNode.class;
    }

    private ResponsibleRepaymentDifficultyNodeComponent component;

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


    public ResponsibleRepaymentDifficultyNode(@NotNull BaseResponsibleLendNode<?> parent, String name) {
        super(parent, name);
    }

}

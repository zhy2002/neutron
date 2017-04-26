package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ResponsibleSignificantChangeFlagNode extends YesNoOptionNode<BaseResponsibleLendNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return ResponsibleSignificantChangeFlagNode.class;
    }

    private ResponsibleSignificantChangeFlagNodeComponent component;

    @Inject
    void createComponent(ResponsibleSignificantChangeFlagNodeComponent.Builder builder) {
        this.component = builder.setResponsibleSignificantChangeFlagNodeModule(new ResponsibleSignificantChangeFlagNodeModule(this)).build();
    }

    private RuleProvider<ResponsibleSignificantChangeFlagNode> getRuleProvider() {
        return component.getResponsibleSignificantChangeFlagNodeRuleProvider();
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

    private RuleProvider<ResponsibleSignificantChangeFlagNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public ResponsibleSignificantChangeFlagNode(@NotNull BaseResponsibleLendNode<?> parent, String name) {
        super(parent, name);
    }

}

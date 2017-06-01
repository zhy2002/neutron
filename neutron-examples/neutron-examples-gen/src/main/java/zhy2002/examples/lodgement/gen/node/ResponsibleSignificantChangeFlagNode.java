package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ResponsibleSignificantChangeFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class ResponsibleSignificantChangeFlagNode extends YesNoOptionNode<BaseResponsibleLendNode<?>> {

    @Inject
    public ResponsibleSignificantChangeFlagNode(@Owner BaseResponsibleLendNode<?> parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ResponsibleSignificantChangeFlagNode.class;
    }

    protected final ResponsibleSignificantChangeFlagNodeComponent getComponent() {
        return component;
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

}

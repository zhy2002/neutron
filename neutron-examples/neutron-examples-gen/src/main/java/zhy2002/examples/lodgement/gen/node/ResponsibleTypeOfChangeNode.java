package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.ResponsibleTypeOfChangeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ResponsibleTypeOfChangeNode extends StringUiNode<BaseResponsibleLendNode<?>> {

    @Inject
    public ResponsibleTypeOfChangeNode(@Owner BaseResponsibleLendNode<?> parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ResponsibleTypeOfChangeNode.class;
    }

    protected final ResponsibleTypeOfChangeNodeComponent getComponent() {
        return component;
    }


    private ResponsibleTypeOfChangeNodeComponent component;

    @Inject
    void createComponent(ResponsibleTypeOfChangeNodeComponent.Builder builder) {
        this.component = builder.setResponsibleTypeOfChangeNodeModule(new ResponsibleTypeOfChangeNodeModule(this)).build();
    }

    private RuleProvider<ResponsibleTypeOfChangeNode> getRuleProvider() {
        return component.getResponsibleTypeOfChangeNodeRuleProvider();
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

    private RuleProvider<ResponsibleTypeOfChangeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

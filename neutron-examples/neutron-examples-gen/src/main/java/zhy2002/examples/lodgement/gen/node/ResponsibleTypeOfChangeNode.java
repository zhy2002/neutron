package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class ResponsibleTypeOfChangeNode extends StringUiNode<BaseResponsibleLendNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return ResponsibleTypeOfChangeNode.class;
    }

    private ResponsibleTypeOfChangeNodeComponent component;

    @Inject
    void createComponent(ResponsibleTypeOfChangeNodeComponent.Builder builder) {
        this.component = builder.setResponsibleTypeOfChangeNodeModule(new ResponsibleTypeOfChangeNodeModule(this)).build();
    }

    private ResponsibleTypeOfChangeNodeRuleProvider getRuleProvider() {
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

    public ResponsibleTypeOfChangeNode(@NotNull BaseResponsibleLendNode<?> parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public Object getOptions() {
        return getStateValue(ApplicationNodeConstants.OPTIONS);
    }

    @JsMethod
    public void setOptions(Object value) {
        setStateValue(ApplicationNodeConstants.OPTIONS, Object.class, value);
    }

}

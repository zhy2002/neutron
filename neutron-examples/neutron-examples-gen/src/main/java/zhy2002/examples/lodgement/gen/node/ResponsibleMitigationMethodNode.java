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


public class ResponsibleMitigationMethodNode extends StringUiNode<BaseResponsibleLendNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return ResponsibleMitigationMethodNode.class;
    }

    private ResponsibleMitigationMethodNodeComponent component;

    @Inject
    void createComponent(ResponsibleMitigationMethodNodeComponent.Builder builder) {
        this.component = builder.setResponsibleMitigationMethodNodeModule(new ResponsibleMitigationMethodNodeModule(this)).build();
    }

    private ResponsibleMitigationMethodNodeRuleProvider getRuleProvider() {
        return component.getResponsibleMitigationMethodNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public ResponsibleMitigationMethodNode(@NotNull BaseResponsibleLendNode<?> parent, String name) {
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

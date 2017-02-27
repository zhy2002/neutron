package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected ResponsibleTypeOfChangeNodeRuleProvider getRuleProvider() {
        return component.getResponsibleTypeOfChangeNodeRuleProvider();
    }

    public ResponsibleTypeOfChangeNode(@NotNull BaseResponsibleLendNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.RESPONSIBLE_CHANGE_TYPE.toArray());
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

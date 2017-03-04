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


public class EmploymentStatusNode extends StringUiNode<EmployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return EmploymentStatusNode.class;
    }

    private EmploymentStatusNodeComponent component;

    @Inject
    void createComponent(EmploymentStatusNodeComponent.Builder builder) {
        this.component = builder.setEmploymentStatusNodeModule(new EmploymentStatusNodeModule(this)).build();
    }

    @Override
    protected EmploymentStatusNodeRuleProvider getRuleProvider() {
        return component.getEmploymentStatusNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public EmploymentStatusNode(@NotNull EmployedNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.EMPLOYMENT_STATUS.toArray());
        setRequired(true);
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

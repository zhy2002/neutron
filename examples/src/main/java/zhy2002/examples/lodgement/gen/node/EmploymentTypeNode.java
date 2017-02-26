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


public class EmploymentTypeNode extends StringUiNode<EmploymentNode<?>> {

    @Override
    public final Class<?> getConcreteClass() {
        return EmploymentTypeNode.class;
    }

    private EmploymentTypeNodeComponent component;

    @Inject
    void createComponent(EmploymentTypeNodeComponent.Builder builder) {
        this.component = builder.setEmploymentTypeNodeModule(new EmploymentTypeNodeModule(this)).build();
    }

    @Override
    protected EmploymentTypeNodeRuleProvider getRuleProvider() {
        return component.getEmploymentTypeNodeRuleProvider();
    }

    public EmploymentTypeNode(@NotNull EmploymentNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setOptions(ApplicationNodeConstants.EMPLOYMENT_TYPE.toArray());
        setValue("payeEmployedNode");
    }

    @JsMethod
    public Object getOptions() {
        return getStateValue(ApplicationNodeConstants.OPTIONS);
    }

    @JsMethod
    public void setOptions(Object value) {
        setStateValue(ApplicationNodeConstants.OPTIONS, Object.class, value);
    }

    @Override
    public Boolean getRequired() {
        boolean parentHasValue = getParent().hasValue();
        if(parentHasValue)
            return super.getRequired();

        return Boolean.FALSE;
    }

}

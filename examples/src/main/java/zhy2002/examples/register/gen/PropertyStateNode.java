package zhy2002.examples.register.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;

public class PropertyStateNode extends StringUiNode<PropertyDetailsNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PropertyStateNode.class;
    }

    private PropertyStateNodeComponent component;

    @Inject
    void createComponent(PropertyStateNodeComponent.Builder builder) {
        this.component = builder.setPropertyStateNodeModule(new PropertyStateNodeModule(this)).build();
    }

    @Override
    protected PropertyStateNodeRuleProvider getRuleProvider() {
        return component.getPropertyStateNodeRuleProvider();
    }

    public PropertyStateNode(PropertyDetailsNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setRequired(true);
        setRequiredMessage("Property state is required.");
        setOptions(RegisterNodeConstants.STATES.toArray());
    }

    @JsMethod
    public Object getOptions() {
        return getStateValue(RegisterNodeConstants.OPTIONS);
    }

    @JsMethod
    public void setOptions(Object value) {
        setStateValue(RegisterNodeConstants.OPTIONS, Object.class, value);
    }

}

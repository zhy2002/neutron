package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


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

    private PropertyStateNodeRuleProvider getRuleProvider() {
        return component.getPropertyStateNodeRuleProvider();
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

    private RuleProvider<PropertyStateNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public PropertyStateNode(@NotNull PropertyDetailsNode parent, String name) {
        super(parent, name);
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

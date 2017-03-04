package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;


public class PasswordNode extends StringUiNode<RegisterNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return PasswordNode.class;
    }

    private PasswordNodeComponent component;

    @Inject
    void createComponent(PasswordNodeComponent.Builder builder) {
        this.component = builder.setPasswordNodeModule(new PasswordNodeModule(this)).build();
    }

    @Override
    protected PasswordNodeRuleProvider getRuleProvider() {
        return component.getPasswordNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public PasswordNode(@NotNull RegisterNode parent, String name) {
        super(parent, name);
    }

    @JsMethod
    public String getMessage() {
        return getStateValue(RegisterNodeConstants.MESSAGE);
    }

    @JsMethod
    public void setMessage(String value) {
        setStateValue(RegisterNodeConstants.MESSAGE, String.class, value);
    }

}

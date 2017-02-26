package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.math.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;


public class EmailNode extends StringUiNode<RegisterNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return EmailNode.class;
    }

    private EmailNodeComponent component;

    @Inject
    void createComponent(EmailNodeComponent.Builder builder) {
        this.component = builder.setEmailNodeModule(new EmailNodeModule(this)).build();
    }

    @Override
    protected EmailNodeRuleProvider getRuleProvider() {
        return component.getEmailNodeRuleProvider();
    }

    public EmailNode(@NotNull RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    protected void initializeState() {
        super.initializeState();

        setPattern("\\w+@\\w+\\.[\\w.]+");
        setPatternMessage("Email format is invalid.");
        setRequiredMessage("Email is required.");
    }

    @JsMethod
    public String getTriggeredBy() {
        return getStateValue(RegisterNodeConstants.TRIGGERED_BY);
    }

    @JsMethod
    public void setTriggeredBy(String value) {
        setStateValue(RegisterNodeConstants.TRIGGERED_BY, String.class, value);
    }

}

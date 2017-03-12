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

    private EmailNodeRuleProvider getRuleProvider() {
        return component.getEmailNodeRuleProvider();
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

    private RuleProvider<EmailNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    public EmailNode(@NotNull RegisterNode parent, String name) {
        super(parent, name);
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

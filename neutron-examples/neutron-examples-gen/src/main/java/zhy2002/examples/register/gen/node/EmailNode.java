package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;

public class EmailNode extends StringUiNode<RegisterNode> {
    public static final PropertyMetadata<String> TRIGGERED_BY_PROPERTY = MetadataRegistry.createProperty(EmailNode.class, "triggeredBy", String.class);
    private EmailNodeComponent component;

    public EmailNode(@NotNull RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return EmailNode.class;
    }

    @Inject
    void createComponent(EmailNodeComponent.Builder builder) {
        this.component = builder.setEmailNodeModule(new EmailNodeModule(this)).build();
    }

    private RuleProvider<EmailNode> getRuleProvider() {
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

    @JsMethod
    public String getTriggeredBy() {
        return getStateValue(TRIGGERED_BY_PROPERTY);
    }

    @JsMethod
    public void setTriggeredBy(String value) {
        setStateValue(TRIGGERED_BY_PROPERTY, value);
    }

}

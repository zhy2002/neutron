package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.EmailNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.register.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class EmailNode extends StringUiNode<RegisterNode> {

    @Inject
    protected EmailNode(@Owner RegisterNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return EmailNode.class;
    }

    protected final EmailNodeComponent getComponent() {
        return component;
    }


    private EmailNodeComponent component;

    @Inject
    void createComponent(EmailNodeComponent.Builder builder) {
        this.component = builder.setEmailNodeModule(new EmailNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    public static final PropertyMetadata<String> TRIGGERED_BY_PROPERTY = MetadataRegistry.createProperty(EmailNode.class, "triggeredBy", String.class);

    @JsMethod
    public String getTriggeredBy() {
        return getStateValue(TRIGGERED_BY_PROPERTY);
    }

    @JsMethod
    public void setTriggeredBy(String value) {
        setStateValue(TRIGGERED_BY_PROPERTY, value);
    }

}

package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.PasswordNodeComponent;
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


public class PasswordNode extends StringUiNode<RegisterNode> {

    @Inject
    protected PasswordNode(@Owner RegisterNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return PasswordNode.class;
    }

    protected final PasswordNodeComponent getComponent() {
        return component;
    }


    private PasswordNodeComponent component;

    @Inject
    void createComponent(PasswordNodeComponent.Builder builder) {
        this.component = builder.setPasswordNodeModule(new PasswordNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    public static final PropertyMetadata<String> MESSAGE_PROPERTY = MetadataRegistry.createProperty(PasswordNode.class, "message", String.class);

    @JsMethod
    public String getMessage() {
        return getStateValue(MESSAGE_PROPERTY);
    }

    @JsMethod
    public void setMessage(String value) {
        setStateValue(MESSAGE_PROPERTY, value);
    }

}

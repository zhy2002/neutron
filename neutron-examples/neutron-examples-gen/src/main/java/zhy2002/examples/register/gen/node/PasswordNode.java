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

public class PasswordNode extends StringUiNode<RegisterNode> {
    public static final PropertyMetadata<String> MESSAGE_PROPERTY = MetadataRegistry.createProperty(PasswordNode.class, "message", String.class);
    private PasswordNodeComponent component;

    public PasswordNode(@NotNull RegisterNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return PasswordNode.class;
    }

    @Inject
    void createComponent(PasswordNodeComponent.Builder builder) {
        this.component = builder.setPasswordNodeModule(new PasswordNodeModule(this)).build();
    }

    private RuleProvider<PasswordNode> getRuleProvider() {
        return component.getPasswordNodeRuleProvider();
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

    private RuleProvider<PasswordNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @JsMethod
    public String getMessage() {
        return getStateValue(MESSAGE_PROPERTY);
    }

    @JsMethod
    public void setMessage(String value) {
        setStateValue(MESSAGE_PROPERTY, value);
    }

}

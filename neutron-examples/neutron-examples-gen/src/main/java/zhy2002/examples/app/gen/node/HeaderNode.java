package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.app.gen.di.HeaderNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.app.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
import zhy2002.examples.app.gen.rule.*;
import zhy2002.examples.app.gen.di.*;
import java.util.List;


public class HeaderNode extends ObjectUiNode<GlobalUiStateNode> {

    @Inject
    protected HeaderNode(@Owner GlobalUiStateNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return HeaderNode.class;
    }

    protected final HeaderNodeComponent getComponent() {
        return component;
    }


    private HeaderNodeComponent component;

    @Inject
    void createComponent(HeaderNodeComponent.Builder builder) {
        this.component = builder.setHeaderNodeModule(new HeaderNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    public static final PropertyMetadata<String> SITE_LOGO_PATH_PROPERTY = MetadataRegistry.createProperty(HeaderNode.class, "siteLogoPath", String.class);

    @JsMethod
    public String getSiteLogoPath() {
        return getStateValue(SITE_LOGO_PATH_PROPERTY);
    }

    @JsMethod
    public void setSiteLogoPath(String value) {
        setStateValue(SITE_LOGO_PATH_PROPERTY, value);
    }

}

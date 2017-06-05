package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.app.gen.di.SiteLogoNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.app.data.*;
import zhy2002.examples.app.gen.rule.*;
import zhy2002.examples.app.gen.di.*;
import java.util.List;


public class SiteLogoNode extends StringUiNode<MenuNode> {

    @Inject
    protected SiteLogoNode(@Owner MenuNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return SiteLogoNode.class;
    }

    protected final SiteLogoNodeComponent getComponent() {
        return component;
    }


    private SiteLogoNodeComponent component;

    @Inject
    void createComponent(SiteLogoNodeComponent.Builder builder) {
        this.component = builder.setSiteLogoNodeModule(new SiteLogoNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}

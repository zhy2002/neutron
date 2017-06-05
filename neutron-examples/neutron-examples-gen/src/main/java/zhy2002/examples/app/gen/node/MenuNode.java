package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.app.gen.di.MenuNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.app.gen.rule.*;
import zhy2002.examples.app.gen.di.*;
import java.util.List;


public class MenuNode extends ObjectUiNode<GlobalUiStateNode> {

    @Inject
    protected MenuNode(@Owner GlobalUiStateNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MenuNode.class;
    }

    protected final MenuNodeComponent getComponent() {
        return component;
    }


    private MenuNodeComponent component;

    @Inject
    void createComponent(MenuNodeComponent.Builder builder) {
        this.component = builder.setMenuNodeModule(new MenuNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    //region children getters

    @JsMethod
    public SiteLogoNode getSiteLogoNode() {
        return (SiteLogoNode)getChildByName("siteLogoNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("siteLogoNode");
        children.add(getComponent().createSiteLogoNode());
        setChildNodeIdentity(null);
        return children;
    }

}

package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.app.gen.di.GlobalUiStateNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.app.gen.rule.*;
import zhy2002.examples.app.gen.di.*;
import java.util.List;
import zhy2002.examples.app.gen.*;
import zhy2002.examples.app.gen.event.*;


@Singleton
public class GlobalUiStateNode extends RootUiNode<VoidUiNode> {

    @Inject
    public GlobalUiStateNode(@NotNull GlobalUiStateNodeContext context) {
        super(context);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return GlobalUiStateNode.class;
    }

    protected final GlobalUiStateNodeComponent getComponent() {
        return component;
    }


    private GlobalUiStateNodeComponent component;

    @Inject
    void createComponent(GlobalUiStateNodeComponent.Builder builder) {
        this.component = builder.setGlobalUiStateNodeModule(new GlobalUiStateNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    @Override
    protected final NodeLoadEvent<GlobalUiStateNode> createNodeLoadEvent() {
        return new GlobalUiStateNodeLoadEvent(this);
    }

    @Override
    protected final NodeUnloadEvent<GlobalUiStateNode> createNodeUnloadEvent() {
        return new GlobalUiStateNodeUnloadEvent(this);
    }

    //region children getters

    @JsMethod
    public MenuNode getMenuNode() {
        return (MenuNode)getChildByName("menuNode");
    }

    @JsMethod
    public AppManagerNode getAppManagerNode() {
        return (AppManagerNode)getChildByName("appManagerNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("menuNode");
        children.add(getComponent().createMenuNode());
        setChildNodeIdentity("appManagerNode");
        children.add(getComponent().createAppManagerNode());
        setChildNodeIdentity(null);
        return children;
    }

}

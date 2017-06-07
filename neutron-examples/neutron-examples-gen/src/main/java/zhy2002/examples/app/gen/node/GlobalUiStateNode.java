package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.app.gen.di.GlobalUiStateNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.app.data.*;
import zhy2002.neutron.config.MetadataRegistry;
import zhy2002.neutron.config.PropertyMetadata;
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

    public static final PropertyMetadata<Integer> SELECTED_TAB_INDEX_PROPERTY = MetadataRegistry.createProperty(GlobalUiStateNode.class, "selectedTabIndex", Integer.class, 0);
    public static final PropertyMetadata<Double> HEADER_HEIGHT_PROPERTY = MetadataRegistry.createProperty(GlobalUiStateNode.class, "headerHeight", Double.class, Double.NaN);
    public static final PropertyMetadata<Double> FOOTER_HEIGHT_PROPERTY = MetadataRegistry.createProperty(GlobalUiStateNode.class, "footerHeight", Double.class, Double.NaN);

    @JsMethod
    public int getSelectedTabIndex() {
        return getStateValue(SELECTED_TAB_INDEX_PROPERTY);
    }

    @JsMethod
    public void setSelectedTabIndex(int value) {
        setStateValue(SELECTED_TAB_INDEX_PROPERTY, value);
    }


    @JsMethod
    public double getHeaderHeight() {
        return getStateValue(HEADER_HEIGHT_PROPERTY);
    }

    @JsMethod
    public void setHeaderHeight(double value) {
        setStateValue(HEADER_HEIGHT_PROPERTY, value);
    }


    @JsMethod
    public double getFooterHeight() {
        return getStateValue(FOOTER_HEIGHT_PROPERTY);
    }

    @JsMethod
    public void setFooterHeight(double value) {
        setStateValue(FOOTER_HEIGHT_PROPERTY, value);
    }

    //region children getters

    @JsMethod
    public HeaderNode getHeaderNode() {
        return (HeaderNode)getChildByName("headerNode");
    }

    @JsMethod
    public OpenAppsNode getOpenAppsNode() {
        return (OpenAppsNode)getChildByName("openAppsNode");
    }

    @JsMethod
    public AppManagerNode getAppManagerNode() {
        return (AppManagerNode)getChildByName("appManagerNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("headerNode");
        children.add(getComponent().createHeaderNode());
        setChildNodeIdentity("openAppsNode");
        children.add(getComponent().createOpenAppsNode());
        setChildNodeIdentity("appManagerNode");
        children.add(getComponent().createAppManagerNode());
        setChildNodeIdentity(null);
        return children;
    }

}

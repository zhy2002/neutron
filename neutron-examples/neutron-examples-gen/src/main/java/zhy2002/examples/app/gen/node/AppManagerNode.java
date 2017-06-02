package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.app.gen.di.AppManagerNodeComponent;
import jsinterop.annotations.*;
import java.math.BigDecimal;
import javax.inject.*;
import zhy2002.neutron.di.*;
import java.util.*;
import zhy2002.examples.app.data.*;
import zhy2002.examples.app.gen.rule.*;
import zhy2002.examples.app.gen.di.*;
import java.util.List;


public class AppManagerNode extends ObjectUiNode<LodgementNode> {

    @Inject
    protected AppManagerNode(@Owner LodgementNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AppManagerNode.class;
    }

    protected final AppManagerNodeComponent getComponent() {
        return component;
    }


    private AppManagerNodeComponent component;

    @Inject
    void createComponent(AppManagerNodeComponent.Builder builder) {
        this.component = builder.setAppManagerNodeModule(new AppManagerNodeModule(this)).build();
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
    public ApplicationListNode getApplicationListNode() {
        return (ApplicationListNode)getChildByName("applicationListNode");
    }

    //endregion
    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("applicationListNode");
        children.add(getComponent().createApplicationListNode());
        setChildNodeIdentity(null);
        return children;
    }

}

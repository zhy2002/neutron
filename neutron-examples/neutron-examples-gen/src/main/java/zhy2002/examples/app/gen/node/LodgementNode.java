package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
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
public class LodgementNode extends RootUiNode<VoidUiNode> {
    private LodgementNodeChildFactory childFactory;
    private LodgementNodeComponent component;

    @Inject
    public LodgementNode(@NotNull LodgementNodeContext context) {
        super(context);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return LodgementNode.class;
    }

    @Inject
    void receiveNodeProvider(LodgementNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(LodgementNodeComponent.Builder builder) {
        this.component = builder.setLodgementNodeModule(new LodgementNodeModule(this)).build();
    }

    private RuleProvider<LodgementNode> getRuleProvider() {
        return component.getLodgementNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }

    @Override
    protected final NodeLoadEvent<LodgementNode> createNodeLoadEvent() {
        return new LodgementNodeLoadEvent(this);
    }

    @Override
    protected final NodeUnloadEvent<LodgementNode> createNodeUnloadEvent() {
        return new LodgementNodeUnloadEvent(this);
    }

    @JsMethod
    public AppManagerNode getAppManagerNode() {
        return (AppManagerNode)getChildByName("appManagerNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("appManagerNode");
        children.add(childFactory.createAppManagerNode());
        setChildNodeIdentity(null);
        return children;
    }

}

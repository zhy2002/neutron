package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import zhy2002.examples.app.gen.rule.*;
import zhy2002.examples.app.gen.di.*;
import zhy2002.examples.app.gen.*;


@Singleton
public class LodgementNode extends ObjectUiNode<VoidUiNode> {

    private AppManagerNode appManagerNode;

    private LodgementNodeChildFactory childFactory;

    @Inject
    void receiveNodeProvider(LodgementNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return LodgementNode.class;
    }

    private LodgementNodeComponent component;

    @Inject
    void createComponent(LodgementNodeComponent.Builder builder) {
        this.component = builder.setLodgementNodeModule(new LodgementNodeModule(this)).build();
    }

    @Override
    protected LodgementNodeRuleProvider getRuleProvider() {
        return component.getLodgementNodeRuleProvider();
    }

    @Inject
    public LodgementNode(@NotNull LodgementNodeContext context) {
        super(context);
    }

    @JsMethod
    public AppManagerNode getAppManagerNode() {
        return appManagerNode;
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        appManagerNode = childFactory.createAppManagerNode();
        children.add(appManagerNode);
        return children;
    }

}

package zhy2002.examples.app.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.app.data.*;
import zhy2002.examples.app.gen.rule.*;
import zhy2002.examples.app.gen.di.*;

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

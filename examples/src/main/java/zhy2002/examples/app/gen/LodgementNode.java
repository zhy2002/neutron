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

@Singleton
public class LodgementNode extends ObjectUiNode<VoidUiNode>
{
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

    @Inject
    LodgementNodeRuleProvider ruleProvider;

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        super.createRules(createdRules);

        createdRules.addAll(ruleProvider.createRules(this));
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

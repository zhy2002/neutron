package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
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

    private AppManagerNodeChildFactory childFactory;
    private AppManagerNodeComponent component;

    @Inject
    public AppManagerNode(@Owner LodgementNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AppManagerNode.class;
    }

    @Inject
    void receiveNodeProvider(AppManagerNodeChildProvider provider) {
        childFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(AppManagerNodeComponent.Builder builder) {
        this.component = builder.setAppManagerNodeModule(new AppManagerNodeModule(this)).build();
    }

    private RuleProvider<AppManagerNode> getRuleProvider() {
        return component.getAppManagerNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<AppManagerNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @JsMethod
    public ApplicationListNode getApplicationListNode() {
        return (ApplicationListNode)getChildByName("applicationListNode");
    }

    @Override
    protected List<UiNode<?>> createChildren() {
        List<UiNode<?>> children = super.createChildren();
        setChildNodeIdentity("applicationListNode");
        children.add(childFactory.createApplicationListNode());
        setChildNodeIdentity(null);
        return children;
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LenderNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class LenderNode extends StringUiNode<ApplicationNode> {

    @Inject
    public LenderNode(@Owner ApplicationNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LenderNode.class;
    }

    protected final LenderNodeComponent getComponent() {
        return component;
    }


    private LenderNodeComponent component;

    @Inject
    void createComponent(LenderNodeComponent.Builder builder) {
        this.component = builder.setLenderNodeModule(new LenderNodeModule(this)).build();
    }

    private RuleProvider<LenderNode> getRuleProvider() {
        return component.getLenderNodeRuleProvider();
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

    private RuleProvider<LenderNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

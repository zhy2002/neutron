package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.UnemployedSinceNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class UnemployedSinceNode extends MonthYearNode<UnemployedNode> {

    @Inject
    public UnemployedSinceNode(@Owner UnemployedNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return UnemployedSinceNode.class;
    }

    protected final UnemployedSinceNodeComponent getComponent() {
        return component;
    }


    private UnemployedSinceNodeComponent component;

    @Inject
    void createComponent(UnemployedSinceNodeComponent.Builder builder) {
        this.component = builder.setUnemployedSinceNodeModule(new UnemployedSinceNodeModule(this)).build();
    }

    private RuleProvider<UnemployedSinceNode> getRuleProvider() {
        return component.getUnemployedSinceNodeRuleProvider();
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

    private RuleProvider<UnemployedSinceNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

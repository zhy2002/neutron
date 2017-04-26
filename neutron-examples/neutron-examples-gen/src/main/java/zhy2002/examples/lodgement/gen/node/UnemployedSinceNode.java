package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class UnemployedSinceNode extends MonthYearNode<UnemployedNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return UnemployedSinceNode.class;
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


    public UnemployedSinceNode(@NotNull UnemployedNode parent, String name) {
        super(parent, name);
    }

}

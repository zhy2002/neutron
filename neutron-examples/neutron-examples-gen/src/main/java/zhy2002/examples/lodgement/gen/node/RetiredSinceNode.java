package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class RetiredSinceNode extends MonthYearNode<RetiredEmploymentNode> {

    @Inject
    public RetiredSinceNode(@Owner RetiredEmploymentNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return RetiredSinceNode.class;
    }

    private RetiredSinceNodeComponent component;

    @Inject
    void createComponent(RetiredSinceNodeComponent.Builder builder) {
        this.component = builder.setRetiredSinceNodeModule(new RetiredSinceNodeModule(this)).build();
    }

    private RuleProvider<RetiredSinceNode> getRuleProvider() {
        return component.getRetiredSinceNodeRuleProvider();
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

    private RuleProvider<RetiredSinceNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.RepeatPasswordNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;

public class RepeatPasswordNode extends StringUiNode<RegisterNode> {

    @Inject
    public RepeatPasswordNode(@Owner RegisterNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return RepeatPasswordNode.class;
    }

    protected final RepeatPasswordNodeComponent getComponent() {
        return component;
    }


    private RepeatPasswordNodeComponent component;

    @Inject
    void createComponent(RepeatPasswordNodeComponent.Builder builder) {
        this.component = builder.setRepeatPasswordNodeModule(new RepeatPasswordNodeModule(this)).build();
    }

    private RuleProvider<RepeatPasswordNode> getRuleProvider() {
        return component.getRepeatPasswordNodeRuleProvider();
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

    private RuleProvider<RepeatPasswordNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

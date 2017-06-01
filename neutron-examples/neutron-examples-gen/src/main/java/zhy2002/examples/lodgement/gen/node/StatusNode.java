package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class StatusNode extends StringUiNode<ApplicationNode> {

    private StatusNodeComponent component;

    @Inject
    public StatusNode(@Owner ApplicationNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return StatusNode.class;
    }

    @Inject
    void createComponent(StatusNodeComponent.Builder builder) {
        this.component = builder.setStatusNodeModule(new StatusNodeModule(this)).build();
    }

    private RuleProvider<StatusNode> getRuleProvider() {
        return component.getStatusNodeRuleProvider();
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

    private RuleProvider<StatusNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

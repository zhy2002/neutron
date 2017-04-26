package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OwningUserNode extends StringUiNode<ApplicationNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OwningUserNode.class;
    }

    private OwningUserNodeComponent component;

    @Inject
    void createComponent(OwningUserNodeComponent.Builder builder) {
        this.component = builder.setOwningUserNodeModule(new OwningUserNodeModule(this)).build();
    }

    private RuleProvider<OwningUserNode> getRuleProvider() {
        return component.getOwningUserNodeRuleProvider();
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

    private RuleProvider<OwningUserNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public OwningUserNode(@NotNull ApplicationNode parent, String name) {
        super(parent, name);
    }

}

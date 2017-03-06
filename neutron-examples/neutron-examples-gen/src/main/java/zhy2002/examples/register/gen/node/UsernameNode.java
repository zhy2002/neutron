package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class UsernameNode extends StringUiNode<RegisterNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return UsernameNode.class;
    }

    private UsernameNodeComponent component;

    @Inject
    void createComponent(UsernameNodeComponent.Builder builder) {
        this.component = builder.setUsernameNodeModule(new UsernameNodeModule(this)).build();
    }

    private UsernameNodeRuleProvider getRuleProvider() {
        return component.getUsernameNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public UsernameNode(@NotNull RegisterNode parent, String name) {
        super(parent, name);
    }

}

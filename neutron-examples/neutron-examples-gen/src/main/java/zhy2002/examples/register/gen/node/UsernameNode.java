package zhy2002.examples.register.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.register.gen.di.UsernameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.register.data.*;
import zhy2002.examples.register.gen.rule.*;
import zhy2002.examples.register.gen.di.*;
import java.util.List;


public class UsernameNode extends StringUiNode<RegisterNode> {

    @Inject
    protected UsernameNode(@Owner RegisterNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return UsernameNode.class;
    }

    protected final UsernameNodeComponent getComponent() {
        return component;
    }


    private UsernameNodeComponent component;

    @Inject
    void createComponent(UsernameNodeComponent.Builder builder) {
        this.component = builder.setUsernameNodeModule(new UsernameNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}

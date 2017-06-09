package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.app.gen.di.ApplicationListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.app.gen.rule.*;
import zhy2002.examples.app.gen.di.*;
import java.util.List;


public class ApplicationListNode extends AnyUiNode<AppManagerNode> {

    @Inject
    protected ApplicationListNode(@Owner AppManagerNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return ApplicationListNode.class;
    }

    protected final ApplicationListNodeComponent getComponent() {
        return component;
    }


    private ApplicationListNodeComponent component;

    @Inject
    void createComponent(ApplicationListNodeComponent.Builder builder) {
        this.component = builder.setApplicationListNodeModule(new ApplicationListNodeModule(this)).build();
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

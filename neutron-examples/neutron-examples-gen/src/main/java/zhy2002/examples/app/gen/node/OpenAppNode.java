package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.app.gen.di.OpenAppNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.app.gen.rule.*;
import zhy2002.examples.app.gen.di.*;
import java.util.List;


public class OpenAppNode extends AnyUiNode<OpenAppsNode> {

    @Inject
    protected OpenAppNode(@Owner OpenAppsNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OpenAppNode.class;
    }

    protected final OpenAppNodeComponent getComponent() {
        return component;
    }


    private OpenAppNodeComponent component;

    @Inject
    void createComponent(OpenAppNodeComponent.Builder builder) {
        this.component = builder.setOpenAppNodeModule(new OpenAppNodeModule(this)).build();
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

package zhy2002.examples.app.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.app.gen.di.OpenAppsNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.app.gen.rule.*;
import zhy2002.examples.app.gen.di.*;
import java.util.List;
import zhy2002.examples.app.gen.event.*;


public class OpenAppsNode extends ListUiNode<GlobalUiStateNode, OpenAppNode> {

    @Inject
    protected OpenAppsNode(@Owner GlobalUiStateNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OpenAppsNode.class;
    }

    protected final OpenAppsNodeComponent getComponent() {
        return component;
    }


    private OpenAppsNodeComponent component;

    @Inject
    void createComponent(OpenAppsNodeComponent.Builder builder) {
        this.component = builder.setOpenAppsNodeModule(new OpenAppsNodeModule(this)).build();
    }

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

    @Override
    public Class<OpenAppNode> getItemClass() {
        return OpenAppNode.class;
    }

    @Override
    public NodeAddEvent<OpenAppNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        OpenAppNode item = getComponent().createOpenAppNode();
        setNameOfChildBeingCreated(null);
        return new OpenAppNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<OpenAppNode> createItemRemoveEvent(OpenAppNode item) {
        return new OpenAppNodeRemoveEvent(item);
    }

}

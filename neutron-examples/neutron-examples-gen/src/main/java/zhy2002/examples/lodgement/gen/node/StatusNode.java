package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.StatusNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class StatusNode extends StringUiNode<ApplicationNode> {

    @Inject
    public StatusNode(@Owner ApplicationNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return StatusNode.class;
    }

    protected final StatusNodeComponent getComponent() {
        return component;
    }


    private StatusNodeComponent component;

    @Inject
    void createComponent(StatusNodeComponent.Builder builder) {
        this.component = builder.setStatusNodeModule(new StatusNodeModule(this)).build();
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

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OwningUserNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OwningUserNode extends StringUiNode<ApplicationNode> {

    @Inject
    protected OwningUserNode(@Owner ApplicationNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OwningUserNode.class;
    }

    protected final OwningUserNodeComponent getComponent() {
        return component;
    }


    private OwningUserNodeComponent component;

    @Inject
    void createComponent(OwningUserNodeComponent.Builder builder) {
        this.component = builder.setOwningUserNodeModule(new OwningUserNodeModule(this)).build();
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

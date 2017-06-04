package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AccessContactTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AccessContactTypeNode extends StringUiNode<AccessNode> {

    @Inject
    protected AccessContactTypeNode(@Owner AccessNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AccessContactTypeNode.class;
    }

    protected final AccessContactTypeNodeComponent getComponent() {
        return component;
    }


    private AccessContactTypeNodeComponent component;

    @Inject
    void createComponent(AccessContactTypeNodeComponent.Builder builder) {
        this.component = builder.setAccessContactTypeNodeModule(new AccessContactTypeNodeModule(this)).build();
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

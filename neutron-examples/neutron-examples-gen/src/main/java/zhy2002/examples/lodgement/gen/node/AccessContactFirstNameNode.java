package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AccessContactFirstNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AccessContactFirstNameNode extends StringUiNode<AccessNode> {

    @Inject
    public AccessContactFirstNameNode(@Owner AccessNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AccessContactFirstNameNode.class;
    }

    protected final AccessContactFirstNameNodeComponent getComponent() {
        return component;
    }


    private AccessContactFirstNameNodeComponent component;

    @Inject
    void createComponent(AccessContactFirstNameNodeComponent.Builder builder) {
        this.component = builder.setAccessContactFirstNameNodeModule(new AccessContactFirstNameNodeModule(this)).build();
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

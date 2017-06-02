package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AccessOtherDescriptionNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AccessOtherDescriptionNode extends StringUiNode<AccessNode> {

    @Inject
    protected AccessOtherDescriptionNode(@Owner AccessNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AccessOtherDescriptionNode.class;
    }

    protected final AccessOtherDescriptionNodeComponent getComponent() {
        return component;
    }


    private AccessOtherDescriptionNodeComponent component;

    @Inject
    void createComponent(AccessOtherDescriptionNodeComponent.Builder builder) {
        this.component = builder.setAccessOtherDescriptionNodeModule(new AccessOtherDescriptionNodeModule(this)).build();
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

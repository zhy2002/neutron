package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.AccessContactTitleNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class AccessContactTitleNode extends StringUiNode<AccessNode> {

    @Inject
    public AccessContactTitleNode(@Owner AccessNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return AccessContactTitleNode.class;
    }

    protected final AccessContactTitleNodeComponent getComponent() {
        return component;
    }


    private AccessContactTitleNodeComponent component;

    @Inject
    void createComponent(AccessContactTitleNodeComponent.Builder builder) {
        this.component = builder.setAccessContactTitleNodeModule(new AccessContactTitleNodeModule(this)).build();
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

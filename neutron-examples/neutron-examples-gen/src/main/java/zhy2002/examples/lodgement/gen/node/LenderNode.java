package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LenderNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class LenderNode extends StringUiNode<ApplicationNode> {

    @Inject
    protected LenderNode(@Owner ApplicationNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LenderNode.class;
    }

    protected final LenderNodeComponent getComponent() {
        return component;
    }


    private LenderNodeComponent component;

    @Inject
    void createComponent(LenderNodeComponent.Builder builder) {
        this.component = builder.setLenderNodeModule(new LenderNodeModule(this)).build();
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

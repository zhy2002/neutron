package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OwnershipPercentageNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OwnershipPercentageNode extends BasePercentageNode<OwnershipNode> {

    @Inject
    protected OwnershipPercentageNode(@Owner OwnershipNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OwnershipPercentageNode.class;
    }

    protected final OwnershipPercentageNodeComponent getComponent() {
        return component;
    }


    private OwnershipPercentageNodeComponent component;

    @Inject
    void createComponent(OwnershipPercentageNodeComponent.Builder builder) {
        this.component = builder.setOwnershipPercentageNodeModule(new OwnershipPercentageNodeModule(this)).build();
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

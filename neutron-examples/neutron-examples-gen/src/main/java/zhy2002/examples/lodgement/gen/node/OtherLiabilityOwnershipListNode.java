package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityOwnershipListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherLiabilityOwnershipListNode extends OwnershipListNode<OtherLiabilityNode> {

    @Inject
    public OtherLiabilityOwnershipListNode(@Owner OtherLiabilityNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherLiabilityOwnershipListNode.class;
    }

    protected final OtherLiabilityOwnershipListNodeComponent getComponent() {
        return component;
    }


    private OtherLiabilityOwnershipListNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityOwnershipListNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityOwnershipListNodeModule(new OtherLiabilityOwnershipListNodeModule(this)).build();
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

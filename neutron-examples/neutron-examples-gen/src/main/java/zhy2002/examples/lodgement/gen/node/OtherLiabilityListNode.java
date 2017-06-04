package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherLiabilityListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class OtherLiabilityListNode extends ListUiNode<LiabilitiesNode, OtherLiabilityNode> {

    @Inject
    protected OtherLiabilityListNode(@Owner LiabilitiesNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherLiabilityListNode.class;
    }

    protected final OtherLiabilityListNodeComponent getComponent() {
        return component;
    }


    private OtherLiabilityListNodeComponent component;

    @Inject
    void createComponent(OtherLiabilityListNodeComponent.Builder builder) {
        this.component = builder.setOtherLiabilityListNodeModule(new OtherLiabilityListNodeModule(this)).build();
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
    public Class<OtherLiabilityNode> getItemClass() {
        return OtherLiabilityNode.class;
    }

    @Override
    public NodeAddEvent<OtherLiabilityNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        OtherLiabilityNode item = getComponent().createOtherLiabilityNode();
        setNameOfChildBeingCreated(null);
        return new OtherLiabilityNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<OtherLiabilityNode> createItemRemoveEvent(OtherLiabilityNode item) {
        return new OtherLiabilityNodeRemoveEvent(item);
    }

}

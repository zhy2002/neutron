package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.RealEstateListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class RealEstateListNode extends ListUiNode<ApplicationNode,RealEstateNode> {

    @Inject
    protected RealEstateListNode(@Owner ApplicationNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return RealEstateListNode.class;
    }

    protected final RealEstateListNodeComponent getComponent() {
        return component;
    }


    private RealEstateListNodeComponent component;

    @Inject
    void createComponent(RealEstateListNodeComponent.Builder builder) {
        this.component = builder.setRealEstateListNodeModule(new RealEstateListNodeModule(this)).build();
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
    public Class<RealEstateNode> getItemClass() {
        return RealEstateNode.class;
    }

    @Override
    public NodeAddEvent<RealEstateNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        RealEstateNode item = getComponent().createRealEstateNode();
        setNameOfChildBeingCreated(null);
        return new RealEstateNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<RealEstateNode> createItemRemoveEvent(RealEstateNode item) {
        return new RealEstateNodeRemoveEvent(item);
    }

}

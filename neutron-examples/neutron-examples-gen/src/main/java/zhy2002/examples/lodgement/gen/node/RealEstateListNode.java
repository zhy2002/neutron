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
    public RealEstateListNode(@Owner ApplicationNode parent) {
        super(parent);
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

    private RuleProvider<RealEstateListNode> getRuleProvider() {
        return component.getRealEstateListNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
        getInstanceRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
        getInstanceRuleProvider().createRules(createdRules);
    }

    private RuleProvider<RealEstateListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
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

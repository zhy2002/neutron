package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherAssetOwnershipListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherAssetOwnershipListNode extends OwnershipListNode<OtherAssetNode> {

    @Inject
    public OtherAssetOwnershipListNode(@Owner OtherAssetNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherAssetOwnershipListNode.class;
    }

    protected final OtherAssetOwnershipListNodeComponent getComponent() {
        return component;
    }


    private OtherAssetOwnershipListNodeComponent component;

    @Inject
    void createComponent(OtherAssetOwnershipListNodeComponent.Builder builder) {
        this.component = builder.setOtherAssetOwnershipListNodeModule(new OtherAssetOwnershipListNodeModule(this)).build();
    }

    private RuleProvider<OtherAssetOwnershipListNode> getRuleProvider() {
        return component.getOtherAssetOwnershipListNodeRuleProvider();
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

    private RuleProvider<OtherAssetOwnershipListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

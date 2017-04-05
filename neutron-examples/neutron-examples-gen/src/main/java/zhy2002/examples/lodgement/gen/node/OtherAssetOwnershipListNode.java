package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class OtherAssetOwnershipListNode extends OwnershipListNode<OtherAssetNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return OtherAssetOwnershipListNode.class;
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

    public OtherAssetOwnershipListNode(@NotNull OtherAssetNode parent, String name) {
        super(parent, name);
    }

}

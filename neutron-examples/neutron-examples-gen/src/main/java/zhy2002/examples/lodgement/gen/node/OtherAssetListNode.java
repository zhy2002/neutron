package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherAssetListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class OtherAssetListNode extends ListUiNode<AssetsNode,OtherAssetNode> {

    @Inject
    public OtherAssetListNode(@Owner AssetsNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherAssetListNode.class;
    }

    private OtherAssetListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(OtherAssetListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    protected final OtherAssetListNodeComponent getComponent() {
        return component;
    }


    private OtherAssetListNodeComponent component;

    @Inject
    void createComponent(OtherAssetListNodeComponent.Builder builder) {
        this.component = builder.setOtherAssetListNodeModule(new OtherAssetListNodeModule(this)).build();
    }

    private RuleProvider<OtherAssetListNode> getRuleProvider() {
        return component.getOtherAssetListNodeRuleProvider();
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

    private RuleProvider<OtherAssetListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @Override
    public Class<OtherAssetNode> getItemClass() {
        return OtherAssetNode.class;
    }

    @Override
    public NodeAddEvent<OtherAssetNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<OtherAssetNode> createItemRemoveEvent(OtherAssetNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}

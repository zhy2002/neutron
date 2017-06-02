package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.OtherAssetListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class OtherAssetListNode extends ListUiNode<AssetsNode,OtherAssetNode> {

    @Inject
    protected OtherAssetListNode(@Owner AssetsNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return OtherAssetListNode.class;
    }

    protected final OtherAssetListNodeComponent getComponent() {
        return component;
    }


    private OtherAssetListNodeComponent component;

    @Inject
    void createComponent(OtherAssetListNodeComponent.Builder builder) {
        this.component = builder.setOtherAssetListNodeModule(new OtherAssetListNodeModule(this)).build();
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
    public Class<OtherAssetNode> getItemClass() {
        return OtherAssetNode.class;
    }

    @Override
    public NodeAddEvent<OtherAssetNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        OtherAssetNode item = getComponent().createOtherAssetNode();
        setNameOfChildBeingCreated(null);
        return new OtherAssetNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<OtherAssetNode> createItemRemoveEvent(OtherAssetNode item) {
        return new OtherAssetNodeRemoveEvent(item);
    }

}

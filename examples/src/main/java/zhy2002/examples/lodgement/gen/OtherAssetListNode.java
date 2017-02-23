package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class OtherAssetListNode extends ListUiNode<AssetsNode,OtherAssetNode>
{
    private OtherAssetListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(OtherAssetListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return OtherAssetListNode.class;
    }

    private OtherAssetListNodeComponent component;

    @Inject
    void createComponent(OtherAssetListNodeComponent.Builder builder) {
        this.component = builder.setOtherAssetListNodeModule(new OtherAssetListNodeModule(this)).build();
    }

    @Override
    protected OtherAssetListNodeRuleProvider getRuleProvider() {
        return component.getOtherAssetListNodeRuleProvider();
    }

    public OtherAssetListNode(AssetsNode parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<OtherAssetNode> getItemClass() {
        return OtherAssetNode.class;
    }

    public NodeAddEvent<OtherAssetNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<OtherAssetNode> createItemRemoveEvent(OtherAssetNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}

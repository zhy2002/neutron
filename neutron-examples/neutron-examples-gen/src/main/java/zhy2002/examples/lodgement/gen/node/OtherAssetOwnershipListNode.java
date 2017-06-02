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
    protected OtherAssetOwnershipListNode(@Owner OtherAssetNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}

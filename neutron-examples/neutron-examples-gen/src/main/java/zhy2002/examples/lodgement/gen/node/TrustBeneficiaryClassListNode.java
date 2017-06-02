package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.TrustBeneficiaryClassListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class TrustBeneficiaryClassListNode extends ListUiNode<BaseTrustNode<?>,TrustBeneficiaryClassNode> {

    @Inject
    protected TrustBeneficiaryClassListNode(@Owner BaseTrustNode<?> parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return TrustBeneficiaryClassListNode.class;
    }

    protected final TrustBeneficiaryClassListNodeComponent getComponent() {
        return component;
    }


    private TrustBeneficiaryClassListNodeComponent component;

    @Inject
    void createComponent(TrustBeneficiaryClassListNodeComponent.Builder builder) {
        this.component = builder.setTrustBeneficiaryClassListNodeModule(new TrustBeneficiaryClassListNodeModule(this)).build();
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
    public Class<TrustBeneficiaryClassNode> getItemClass() {
        return TrustBeneficiaryClassNode.class;
    }

    @Override
    public NodeAddEvent<TrustBeneficiaryClassNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        setNameOfChildBeingCreated(name);
        TrustBeneficiaryClassNode item = getComponent().createTrustBeneficiaryClassNode();
        setNameOfChildBeingCreated(null);
        return new TrustBeneficiaryClassNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<TrustBeneficiaryClassNode> createItemRemoveEvent(TrustBeneficiaryClassNode item) {
        return new TrustBeneficiaryClassNodeRemoveEvent(item);
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class TrustBeneficiaryClassListNode extends ListUiNode<BaseTrustNode<?>,TrustBeneficiaryClassNode> {

    private TrustBeneficiaryClassListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(TrustBeneficiaryClassListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return TrustBeneficiaryClassListNode.class;
    }

    private TrustBeneficiaryClassListNodeComponent component;

    @Inject
    void createComponent(TrustBeneficiaryClassListNodeComponent.Builder builder) {
        this.component = builder.setTrustBeneficiaryClassListNodeModule(new TrustBeneficiaryClassListNodeModule(this)).build();
    }

    private TrustBeneficiaryClassListNodeRuleProvider getRuleProvider() {
        return component.getTrustBeneficiaryClassListNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public TrustBeneficiaryClassListNode(@NotNull BaseTrustNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<TrustBeneficiaryClassNode> getItemClass() {
        return TrustBeneficiaryClassNode.class;
    }

    public NodeAddEvent<TrustBeneficiaryClassNode> createItemAddEvent() {
        return itemFactory.createItemAddEvent(String.valueOf(super.getChildSequenceNumber()));
    }

    public NodeRemoveEvent<TrustBeneficiaryClassNode> createItemRemoveEvent(TrustBeneficiaryClassNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}

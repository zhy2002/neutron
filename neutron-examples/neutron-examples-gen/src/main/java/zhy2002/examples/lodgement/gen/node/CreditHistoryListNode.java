package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CreditHistoryListNode extends ListUiNode<BasePrivacyNode<?>,CreditHistoryNode> {

    private CreditHistoryListNodeItemFactory itemFactory;
    private CreditHistoryListNodeComponent component;

    @Inject
    public CreditHistoryListNode(@Owner BasePrivacyNode<?> parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CreditHistoryListNode.class;
    }

    @Inject
    void receiveNodeProvider(CreditHistoryListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Inject
    void createComponent(CreditHistoryListNodeComponent.Builder builder) {
        this.component = builder.setCreditHistoryListNodeModule(new CreditHistoryListNodeModule(this)).build();
    }

    private RuleProvider<CreditHistoryListNode> getRuleProvider() {
        return component.getCreditHistoryListNodeRuleProvider();
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

    private RuleProvider<CreditHistoryListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @Override
    public Class<CreditHistoryNode> getItemClass() {
        return CreditHistoryNode.class;
    }

    @Override
    public NodeAddEvent<CreditHistoryNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<CreditHistoryNode> createItemRemoveEvent(CreditHistoryNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}

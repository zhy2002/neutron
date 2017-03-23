package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CreditHistoryListNode extends ListUiNode<BasePrivacyNode<?>,CreditHistoryNode> {

    private CreditHistoryListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(CreditHistoryListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CreditHistoryListNode.class;
    }

    private CreditHistoryListNodeComponent component;

    @Inject
    void createComponent(CreditHistoryListNodeComponent.Builder builder) {
        this.component = builder.setCreditHistoryListNodeModule(new CreditHistoryListNodeModule(this)).build();
    }

    private CreditHistoryListNodeRuleProvider getRuleProvider() {
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

    public CreditHistoryListNode(@NotNull BasePrivacyNode<?> parent, String name) {
        super(parent, name);
    }

    @Override
    public Class<CreditHistoryNode> getItemClass() {
        return CreditHistoryNode.class;
    }

    @Override
    public NodeAddEvent<CreditHistoryNode> createItemAddEvent(String name) {
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<CreditHistoryNode> createItemRemoveEvent(CreditHistoryNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}

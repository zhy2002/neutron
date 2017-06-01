package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CreditHistoryListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class CreditHistoryListNode extends ListUiNode<BasePrivacyNode<?>,CreditHistoryNode> {

    @Inject
    public CreditHistoryListNode(@Owner BasePrivacyNode<?> parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CreditHistoryListNode.class;
    }

    protected final CreditHistoryListNodeComponent getComponent() {
        return component;
    }


    private CreditHistoryListNodeComponent component;

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
        getContext().setNameOfNodeBeingCreated(name);
        CreditHistoryNode item = getComponent().createCreditHistoryNode();
        getContext().setNameOfNodeBeingCreated(null);
        return new CreditHistoryNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<CreditHistoryNode> createItemRemoveEvent(CreditHistoryNode item) {
        return new CreditHistoryNodeRemoveEvent(item);
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class LoanListNode extends ListUiNode<LiabilitiesNode,LoanNode> {

    @Inject
    public LoanListNode(@Owner LiabilitiesNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LoanListNode.class;
    }

    private LoanListNodeItemFactory itemFactory;

    @Inject
    void receiveNodeProvider(LoanListNodeItemProvider provider) {
        itemFactory = provider.createFactory(this);
    }

    private LoanListNodeComponent component;

    @Inject
    void createComponent(LoanListNodeComponent.Builder builder) {
        this.component = builder.setLoanListNodeModule(new LoanListNodeModule(this)).build();
    }

    private RuleProvider<LoanListNode> getRuleProvider() {
        return component.getLoanListNodeRuleProvider();
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

    private RuleProvider<LoanListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

    @Override
    public Class<LoanNode> getItemClass() {
        return LoanNode.class;
    }

    @Override
    public NodeAddEvent<LoanNode> createItemAddEvent(String name) {
        ensureSequenceNumber(name);
        return itemFactory.createItemAddEvent(name);
    }

    @Override
    public NodeRemoveEvent<LoanNode> createItemRemoveEvent(LoanNode item) {
        return itemFactory.createItemRemoveEvent(item);
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LoanListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;
import zhy2002.examples.lodgement.gen.event.*;


public class LoanListNode extends ListUiNode<LiabilitiesNode,LoanNode> {

    @Inject
    public LoanListNode(@Owner LiabilitiesNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LoanListNode.class;
    }

    protected final LoanListNodeComponent getComponent() {
        return component;
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
        setNameOfChildBeingCreated(name);
        LoanNode item = getComponent().createLoanNode();
        setNameOfChildBeingCreated(null);
        return new LoanNodeAddEvent(item);
    }

    @Override
    public final NodeRemoveEvent<LoanNode> createItemRemoveEvent(LoanNode item) {
        return new LoanNodeRemoveEvent(item);
    }

}

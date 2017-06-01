package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LoanOwnershipListNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class LoanOwnershipListNode extends OwnershipListNode<LoanNode> {

    @Inject
    public LoanOwnershipListNode(@Owner LoanNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LoanOwnershipListNode.class;
    }

    protected final LoanOwnershipListNodeComponent getComponent() {
        return component;
    }


    private LoanOwnershipListNodeComponent component;

    @Inject
    void createComponent(LoanOwnershipListNodeComponent.Builder builder) {
        this.component = builder.setLoanOwnershipListNodeModule(new LoanOwnershipListNodeModule(this)).build();
    }

    private RuleProvider<LoanOwnershipListNode> getRuleProvider() {
        return component.getLoanOwnershipListNodeRuleProvider();
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

    private RuleProvider<LoanOwnershipListNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

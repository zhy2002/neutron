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
    protected LoanOwnershipListNode(@Owner LoanNode parent) {
        super(parent);
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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}

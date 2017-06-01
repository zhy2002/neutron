package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class LoanLenderNameNode extends StringUiNode<LoanNode> {

    private LoanLenderNameNodeComponent component;

    @Inject
    public LoanLenderNameNode(@Owner LoanNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LoanLenderNameNode.class;
    }

    @Inject
    void createComponent(LoanLenderNameNodeComponent.Builder builder) {
        this.component = builder.setLoanLenderNameNodeModule(new LoanLenderNameNodeModule(this)).build();
    }

    private RuleProvider<LoanLenderNameNode> getRuleProvider() {
        return component.getLoanLenderNameNodeRuleProvider();
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

    private RuleProvider<LoanLenderNameNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

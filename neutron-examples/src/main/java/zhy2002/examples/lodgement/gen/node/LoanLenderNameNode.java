package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class LoanLenderNameNode extends StringUiNode<LoanNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return LoanLenderNameNode.class;
    }

    private LoanLenderNameNodeComponent component;

    @Inject
    void createComponent(LoanLenderNameNodeComponent.Builder builder) {
        this.component = builder.setLoanLenderNameNodeModule(new LoanLenderNameNodeModule(this)).build();
    }

    @Override
    protected LoanLenderNameNodeRuleProvider getRuleProvider() {
        return component.getLoanLenderNameNodeRuleProvider();
    }

    public LoanLenderNameNode(@NotNull LoanNode parent, String name) {
        super(parent, name);
    }

}

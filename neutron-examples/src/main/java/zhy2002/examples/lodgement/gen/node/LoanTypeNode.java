package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class LoanTypeNode extends StringUiNode<LoanNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return LoanTypeNode.class;
    }

    private LoanTypeNodeComponent component;

    @Inject
    void createComponent(LoanTypeNodeComponent.Builder builder) {
        this.component = builder.setLoanTypeNodeModule(new LoanTypeNodeModule(this)).build();
    }

    @Override
    protected LoanTypeNodeRuleProvider getRuleProvider() {
        return component.getLoanTypeNodeRuleProvider();
    }

    public LoanTypeNode(@NotNull LoanNode parent, String name) {
        super(parent, name);
    }

}

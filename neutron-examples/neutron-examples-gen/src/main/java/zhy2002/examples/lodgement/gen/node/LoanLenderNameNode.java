package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private LoanLenderNameNodeRuleProvider getRuleProvider() {
        return component.getLoanLenderNameNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public LoanLenderNameNode(@NotNull LoanNode parent, String name) {
        super(parent, name);
    }

}

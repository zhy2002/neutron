package zhy2002.examples.lodgement.gen;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.data.*;
import zhy2002.neutron.util.*;
import jsinterop.annotations.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.math.*;
import zhy2002.examples.lodgement.data.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;

public class LoanLenderNameNode extends StringUiNode<LoanNode>
{
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

    public LoanLenderNameNode(LoanNode parent, String name) {
        super(parent, name);
    }

}

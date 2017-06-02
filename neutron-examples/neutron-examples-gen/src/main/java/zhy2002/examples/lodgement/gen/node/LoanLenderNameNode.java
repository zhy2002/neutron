package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.LoanLenderNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class LoanLenderNameNode extends StringUiNode<LoanNode> {

    @Inject
    protected LoanLenderNameNode(@Owner LoanNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return LoanLenderNameNode.class;
    }

    protected final LoanLenderNameNodeComponent getComponent() {
        return component;
    }


    private LoanLenderNameNodeComponent component;

    @Inject
    void createComponent(LoanLenderNameNodeComponent.Builder builder) {
        this.component = builder.setLoanLenderNameNodeModule(new LoanLenderNameNodeModule(this)).build();
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

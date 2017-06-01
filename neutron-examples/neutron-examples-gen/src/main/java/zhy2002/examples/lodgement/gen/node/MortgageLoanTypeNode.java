package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class MortgageLoanTypeNode extends StringUiNode<ExistingMortgageNode> {

    private MortgageLoanTypeNodeComponent component;

    @Inject
    public MortgageLoanTypeNode(@Owner ExistingMortgageNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return MortgageLoanTypeNode.class;
    }

    @Inject
    void createComponent(MortgageLoanTypeNodeComponent.Builder builder) {
        this.component = builder.setMortgageLoanTypeNodeModule(new MortgageLoanTypeNodeModule(this)).build();
    }

    private RuleProvider<MortgageLoanTypeNode> getRuleProvider() {
        return component.getMortgageLoanTypeNodeRuleProvider();
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

    private RuleProvider<MortgageLoanTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

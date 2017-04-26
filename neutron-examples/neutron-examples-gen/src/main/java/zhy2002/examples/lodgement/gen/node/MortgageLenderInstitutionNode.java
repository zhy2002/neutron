package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class MortgageLenderInstitutionNode extends StringUiNode<ExistingMortgageNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return MortgageLenderInstitutionNode.class;
    }

    private MortgageLenderInstitutionNodeComponent component;

    @Inject
    void createComponent(MortgageLenderInstitutionNodeComponent.Builder builder) {
        this.component = builder.setMortgageLenderInstitutionNodeModule(new MortgageLenderInstitutionNodeModule(this)).build();
    }

    private RuleProvider<MortgageLenderInstitutionNode> getRuleProvider() {
        return component.getMortgageLenderInstitutionNodeRuleProvider();
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

    private RuleProvider<MortgageLenderInstitutionNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }


    public MortgageLenderInstitutionNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}

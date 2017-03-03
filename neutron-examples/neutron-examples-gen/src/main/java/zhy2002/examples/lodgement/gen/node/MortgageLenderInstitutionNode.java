package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


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

    @Override
    protected MortgageLenderInstitutionNodeRuleProvider getRuleProvider() {
        return component.getMortgageLenderInstitutionNodeRuleProvider();
    }

    public MortgageLenderInstitutionNode(@NotNull ExistingMortgageNode parent, String name) {
        super(parent, name);
    }

}
package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanySelectBeneficialOwnerNode extends SelectRelatedPersonListNode<CompanyGeneralNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanySelectBeneficialOwnerNode.class;
    }

    private CompanySelectBeneficialOwnerNodeComponent component;

    @Inject
    void createComponent(CompanySelectBeneficialOwnerNodeComponent.Builder builder) {
        this.component = builder.setCompanySelectBeneficialOwnerNodeModule(new CompanySelectBeneficialOwnerNodeModule(this)).build();
    }

    @Override
    protected CompanySelectBeneficialOwnerNodeRuleProvider getRuleProvider() {
        return component.getCompanySelectBeneficialOwnerNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CompanySelectBeneficialOwnerNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}

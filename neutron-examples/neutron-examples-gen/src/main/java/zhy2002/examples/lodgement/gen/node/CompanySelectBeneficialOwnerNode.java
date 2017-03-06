package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private CompanySelectBeneficialOwnerNodeRuleProvider getRuleProvider() {
        return component.getCompanySelectBeneficialOwnerNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public CompanySelectBeneficialOwnerNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

}

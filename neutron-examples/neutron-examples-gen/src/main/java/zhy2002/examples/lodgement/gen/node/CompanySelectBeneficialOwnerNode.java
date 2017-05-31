package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanySelectBeneficialOwnerNode extends SelectRelatedPersonListNode<CompanyGeneralNode> {
    private CompanySelectBeneficialOwnerNodeComponent component;

    public CompanySelectBeneficialOwnerNode(@NotNull CompanyGeneralNode parent, String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
        return CompanySelectBeneficialOwnerNode.class;
    }

    @Inject
    void createComponent(CompanySelectBeneficialOwnerNodeComponent.Builder builder) {
        this.component = builder.setCompanySelectBeneficialOwnerNodeModule(new CompanySelectBeneficialOwnerNodeModule(this)).build();
    }

    private RuleProvider<CompanySelectBeneficialOwnerNode> getRuleProvider() {
        return component.getCompanySelectBeneficialOwnerNodeRuleProvider();
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

    private RuleProvider<CompanySelectBeneficialOwnerNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

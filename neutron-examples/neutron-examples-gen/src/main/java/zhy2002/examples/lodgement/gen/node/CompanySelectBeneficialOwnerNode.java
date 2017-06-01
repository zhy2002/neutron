package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanySelectBeneficialOwnerNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;

public class CompanySelectBeneficialOwnerNode extends SelectRelatedPersonListNode<CompanyGeneralNode> {

    @Inject
    public CompanySelectBeneficialOwnerNode(@Owner CompanyGeneralNode parent, @ChildName String name) {
        super(parent, name);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanySelectBeneficialOwnerNode.class;
    }

    protected final CompanySelectBeneficialOwnerNodeComponent getComponent() {
        return component;
    }


    private CompanySelectBeneficialOwnerNodeComponent component;

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

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
    protected CompanySelectBeneficialOwnerNode(@Owner CompanyGeneralNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
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

    @Override
    protected void initializeState() {
        this.component.provideRuleProviders().forEach(provider -> provider.initializeState(this));
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        this.component.provideRuleProviders().forEach(provider -> provider.createRules(createdRules));
    }

}

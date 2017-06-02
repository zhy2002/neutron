package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyPrimaryApplicantFlagNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyPrimaryApplicantFlagNode extends BooleanUiNode<CompanyGeneralNode> {

    @Inject
    protected CompanyPrimaryApplicantFlagNode(@Owner CompanyGeneralNode parentProfileNodeInfo) {
        super(parentProfileNodeInfo);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyPrimaryApplicantFlagNode.class;
    }

    protected final CompanyPrimaryApplicantFlagNodeComponent getComponent() {
        return component;
    }


    private CompanyPrimaryApplicantFlagNodeComponent component;

    @Inject
    void createComponent(CompanyPrimaryApplicantFlagNodeComponent.Builder builder) {
        this.component = builder.setCompanyPrimaryApplicantFlagNodeModule(new CompanyPrimaryApplicantFlagNodeModule(this)).build();
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

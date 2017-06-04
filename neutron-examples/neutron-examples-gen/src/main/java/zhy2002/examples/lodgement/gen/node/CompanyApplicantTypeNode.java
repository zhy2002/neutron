package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyApplicantTypeNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyApplicantTypeNode extends BaseApplicantTypeNode<CompanyGeneralNode> {

    @Inject
    protected CompanyApplicantTypeNode(@Owner CompanyGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyApplicantTypeNode.class;
    }

    protected final CompanyApplicantTypeNodeComponent getComponent() {
        return component;
    }


    private CompanyApplicantTypeNodeComponent component;

    @Inject
    void createComponent(CompanyApplicantTypeNodeComponent.Builder builder) {
        this.component = builder.setCompanyApplicantTypeNodeModule(new CompanyApplicantTypeNodeModule(this)).build();
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

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
    public CompanyApplicantTypeNode(@Owner CompanyGeneralNode parent, @ChildName String name) {
        super(parent, name);
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

    private RuleProvider<CompanyApplicantTypeNode> getRuleProvider() {
        return component.getCompanyApplicantTypeNodeRuleProvider();
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

    private RuleProvider<CompanyApplicantTypeNode> getInstanceRuleProvider() {
        return component.getInstanceRuleProviders().get(this.getName());
    }

}

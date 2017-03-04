package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyResponsibleLendNode extends BaseResponsibleLendNode<CompanyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyResponsibleLendNode.class;
    }

    private CompanyResponsibleLendNodeComponent component;

    @Inject
    void createComponent(CompanyResponsibleLendNodeComponent.Builder builder) {
        this.component = builder.setCompanyResponsibleLendNodeModule(new CompanyResponsibleLendNodeModule(this)).build();
    }

    @Override
    protected CompanyResponsibleLendNodeRuleProvider getRuleProvider() {
        return component.getCompanyResponsibleLendNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CompanyResponsibleLendNode(@NotNull CompanyNode parent, String name) {
        super(parent, name);
    }

}

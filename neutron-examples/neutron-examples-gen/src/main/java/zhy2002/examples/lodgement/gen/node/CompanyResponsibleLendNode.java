package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


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

    private CompanyResponsibleLendNodeRuleProvider getRuleProvider() {
        return component.getCompanyResponsibleLendNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public CompanyResponsibleLendNode(@NotNull CompanyNode parent, String name) {
        super(parent, name);
    }

}

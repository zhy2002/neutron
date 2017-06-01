package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyResponsibleLendNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyResponsibleLendNode extends BaseResponsibleLendNode<CompanyNode> {

    @Inject
    public CompanyResponsibleLendNode(@Owner CompanyNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyResponsibleLendNode.class;
    }

    protected final CompanyResponsibleLendNodeComponent getComponent() {
        return component;
    }


    private CompanyResponsibleLendNodeComponent component;

    @Inject
    void createComponent(CompanyResponsibleLendNodeComponent.Builder builder) {
        this.component = builder.setCompanyResponsibleLendNodeModule(new CompanyResponsibleLendNodeModule(this)).build();
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

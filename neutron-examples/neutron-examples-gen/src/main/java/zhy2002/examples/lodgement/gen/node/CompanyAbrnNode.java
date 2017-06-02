package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyAbrnNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyAbrnNode extends StringUiNode<CompanyGeneralNode> {

    @Inject
    protected CompanyAbrnNode(@Owner CompanyGeneralNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyAbrnNode.class;
    }

    protected final CompanyAbrnNodeComponent getComponent() {
        return component;
    }


    private CompanyAbrnNodeComponent component;

    @Inject
    void createComponent(CompanyAbrnNodeComponent.Builder builder) {
        this.component = builder.setCompanyAbrnNodeModule(new CompanyAbrnNodeModule(this)).build();
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

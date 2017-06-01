package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.examples.lodgement.gen.di.CompanyContactFirstNameNodeComponent;
import javax.inject.*;
import zhy2002.neutron.di.*;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyContactFirstNameNode extends StringUiNode<CompanyContactNode> {

    @Inject
    public CompanyContactFirstNameNode(@Owner CompanyContactNode parent) {
        super(parent);
    }

    @Override
    public final Class<?> getConcreteClass() {
    return CompanyContactFirstNameNode.class;
    }

    protected final CompanyContactFirstNameNodeComponent getComponent() {
        return component;
    }


    private CompanyContactFirstNameNodeComponent component;

    @Inject
    void createComponent(CompanyContactFirstNameNodeComponent.Builder builder) {
        this.component = builder.setCompanyContactFirstNameNodeModule(new CompanyContactFirstNameNodeModule(this)).build();
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

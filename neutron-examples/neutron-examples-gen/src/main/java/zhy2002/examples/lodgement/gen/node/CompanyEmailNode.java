package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyEmailNode extends EmailNode<CompanyContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyEmailNode.class;
    }

    private CompanyEmailNodeComponent component;

    @Inject
    void createComponent(CompanyEmailNodeComponent.Builder builder) {
        this.component = builder.setCompanyEmailNodeModule(new CompanyEmailNodeModule(this)).build();
    }

    @Override
    protected CompanyEmailNodeRuleProvider getRuleProvider() {
        return component.getCompanyEmailNodeRuleProvider();
    }

    @Override
    protected void initializeRuleState() {
        getRuleProvider().initializeState(this);
    }


    public CompanyEmailNode(@NotNull CompanyContactNode parent, String name) {
        super(parent, name);
    }

}

package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;
import java.util.List;


public class CompanyTelephoneNode extends TelephoneNode<CompanyContactNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyTelephoneNode.class;
    }

    private CompanyTelephoneNodeComponent component;

    @Inject
    void createComponent(CompanyTelephoneNodeComponent.Builder builder) {
        this.component = builder.setCompanyTelephoneNodeModule(new CompanyTelephoneNodeModule(this)).build();
    }

    private CompanyTelephoneNodeRuleProvider getRuleProvider() {
        return component.getCompanyTelephoneNodeRuleProvider();
    }

    @Override
    protected void initializeState() {
        getRuleProvider().initializeState(this);
    }

    @Override
    protected void createRules(List<UiNodeRule<?>> createdRules) {
        getRuleProvider().createRules(createdRules);
    }


    public CompanyTelephoneNode(@NotNull CompanyContactNode parent, String name) {
        super(parent, name);
    }

}

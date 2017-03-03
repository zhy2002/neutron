package zhy2002.examples.lodgement.gen.node;

import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import javax.inject.*;
import javax.validation.constraints.NotNull;
import zhy2002.examples.lodgement.gen.rule.*;
import zhy2002.examples.lodgement.gen.di.*;


public class CompanyPrivacyNode extends BasePrivacyNode<CompanyNode> {

    @Override
    public final Class<?> getConcreteClass() {
        return CompanyPrivacyNode.class;
    }

    private CompanyPrivacyNodeComponent component;

    @Inject
    void createComponent(CompanyPrivacyNodeComponent.Builder builder) {
        this.component = builder.setCompanyPrivacyNodeModule(new CompanyPrivacyNodeModule(this)).build();
    }

    @Override
    protected CompanyPrivacyNodeRuleProvider getRuleProvider() {
        return component.getCompanyPrivacyNodeRuleProvider();
    }

    public CompanyPrivacyNode(@NotNull CompanyNode parent, String name) {
        super(parent, name);
    }

}

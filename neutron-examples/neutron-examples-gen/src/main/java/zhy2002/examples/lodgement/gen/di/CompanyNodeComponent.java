package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;

@ComponentScope
@Subcomponent(modules = {CompanyNodeModule.class})
public interface CompanyNodeComponent {

    RuleProvider<CompanyNode> getCompanyNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyNodeModule(CompanyNodeModule module);

        CompanyNodeComponent build();
    }
}

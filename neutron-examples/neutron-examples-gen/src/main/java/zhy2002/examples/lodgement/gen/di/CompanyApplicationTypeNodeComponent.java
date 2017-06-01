package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CompanyApplicationTypeNodeModule.class})
public interface CompanyApplicationTypeNodeComponent {

    List<RuleProvider<CompanyApplicationTypeNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyApplicationTypeNodeModule(CompanyApplicationTypeNodeModule module);

        CompanyApplicationTypeNodeComponent build();
    }

}

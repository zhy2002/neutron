package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CompanyAbnNodeModule.class})
public interface CompanyAbnNodeComponent {

    List<RuleProvider<CompanyAbnNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyAbnNodeModule(CompanyAbnNodeModule module);

        CompanyAbnNodeComponent build();
    }

}

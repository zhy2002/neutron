package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CompanyContactFirstNameNodeModule.class})
public interface CompanyContactFirstNameNodeComponent {

    List<RuleProvider<CompanyContactFirstNameNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyContactFirstNameNodeModule(CompanyContactFirstNameNodeModule module);

        CompanyContactFirstNameNodeComponent build();
    }

}

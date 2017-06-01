package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CompanyAcnNodeModule.class})
public interface CompanyAcnNodeComponent {

    List<RuleProvider<CompanyAcnNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyAcnNodeModule(CompanyAcnNodeModule module);

        CompanyAcnNodeComponent build();
    }

}

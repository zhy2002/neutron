package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CompanyTrustNodeModule.class})
public interface CompanyTrustNodeComponent extends BaseTrustNodeComponent {

    List<RuleProvider<CompanyTrustNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyTrustNodeModule(CompanyTrustNodeModule module);

        CompanyTrustNodeComponent build();
    }

}

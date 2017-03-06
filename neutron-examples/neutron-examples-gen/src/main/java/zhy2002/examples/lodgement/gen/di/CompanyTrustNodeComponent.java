package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyTrustNodeScope
@Subcomponent(modules = {CompanyTrustNodeModule.class})
public interface CompanyTrustNodeComponent {

    CompanyTrustNodeRuleProvider getCompanyTrustNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyTrustNodeModule(CompanyTrustNodeModule module);

        CompanyTrustNodeComponent build();
    }
}

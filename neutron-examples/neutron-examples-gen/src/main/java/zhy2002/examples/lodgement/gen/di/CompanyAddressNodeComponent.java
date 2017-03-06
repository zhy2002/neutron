package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyAddressNodeScope
@Subcomponent(modules = {CompanyAddressNodeModule.class})
public interface CompanyAddressNodeComponent {

    CompanyAddressNodeRuleProvider getCompanyAddressNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyAddressNodeModule(CompanyAddressNodeModule module);

        CompanyAddressNodeComponent build();
    }
}

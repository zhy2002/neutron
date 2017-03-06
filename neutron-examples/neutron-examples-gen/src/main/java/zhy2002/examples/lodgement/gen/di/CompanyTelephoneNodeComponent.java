package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyTelephoneNodeScope
@Subcomponent(modules = {CompanyTelephoneNodeModule.class})
public interface CompanyTelephoneNodeComponent {

    CompanyTelephoneNodeRuleProvider getCompanyTelephoneNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyTelephoneNodeModule(CompanyTelephoneNodeModule module);

        CompanyTelephoneNodeComponent build();
    }
}

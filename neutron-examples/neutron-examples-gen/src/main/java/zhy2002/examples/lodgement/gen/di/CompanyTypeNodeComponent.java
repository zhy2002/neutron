package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyTypeNodeScope
@Subcomponent(modules = {CompanyTypeNodeModule.class})
public interface CompanyTypeNodeComponent {

    CompanyTypeNodeRuleProvider getCompanyTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyTypeNodeModule(CompanyTypeNodeModule module);

        CompanyTypeNodeComponent build();
    }
}

package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyContactNodeScope
@Subcomponent(modules = {CompanyContactNodeModule.class})
public interface CompanyContactNodeComponent {

    CompanyContactNodeRuleProvider getCompanyContactNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyContactNodeModule(CompanyContactNodeModule module);

        CompanyContactNodeComponent build();
    }
}

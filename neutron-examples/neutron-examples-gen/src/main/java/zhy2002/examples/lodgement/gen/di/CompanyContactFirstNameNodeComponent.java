package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyContactFirstNameNodeScope
@Subcomponent(modules = {CompanyContactFirstNameNodeModule.class})
public interface CompanyContactFirstNameNodeComponent {

    CompanyContactFirstNameNodeRuleProvider getCompanyContactFirstNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyContactFirstNameNodeModule(CompanyContactFirstNameNodeModule module);

        CompanyContactFirstNameNodeComponent build();
    }
}

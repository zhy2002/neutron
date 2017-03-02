package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CompanyContactLastNameNodeScope
@Subcomponent(modules = {CompanyContactLastNameNodeModule.class})
public interface CompanyContactLastNameNodeComponent {

    CompanyContactLastNameNodeRuleProvider getCompanyContactLastNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyContactLastNameNodeModule(CompanyContactLastNameNodeModule module);

        CompanyContactLastNameNodeComponent build();
    }
}

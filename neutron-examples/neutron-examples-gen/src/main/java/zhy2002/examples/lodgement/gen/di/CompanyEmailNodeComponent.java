package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CompanyEmailNodeScope
@Subcomponent(modules = {CompanyEmailNodeModule.class})
public interface CompanyEmailNodeComponent {

    CompanyEmailNodeRuleProvider getCompanyEmailNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyEmailNodeModule(CompanyEmailNodeModule module);

        CompanyEmailNodeComponent build();
    }
}

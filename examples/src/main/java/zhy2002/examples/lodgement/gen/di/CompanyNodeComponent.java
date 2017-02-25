package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CompanyNodeScope
@Subcomponent(modules = {CompanyNodeModule.class})
public interface CompanyNodeComponent {

    CompanyNodeRuleProvider getCompanyNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyNodeModule(CompanyNodeModule module);

        CompanyNodeComponent build();
    }
}

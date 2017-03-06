package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyListNodeScope
@Subcomponent(modules = {CompanyListNodeModule.class})
public interface CompanyListNodeComponent {

    CompanyListNodeRuleProvider getCompanyListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyListNodeModule(CompanyListNodeModule module);

        CompanyListNodeComponent build();
    }
}

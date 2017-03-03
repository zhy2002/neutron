package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CompanyAbnNodeScope
@Subcomponent(modules = {CompanyAbnNodeModule.class})
public interface CompanyAbnNodeComponent {

    CompanyAbnNodeRuleProvider getCompanyAbnNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyAbnNodeModule(CompanyAbnNodeModule module);

        CompanyAbnNodeComponent build();
    }
}

package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@CompanyDescriptionNodeScope
@Subcomponent(modules = {CompanyDescriptionNodeModule.class})
public interface CompanyDescriptionNodeComponent {

    CompanyDescriptionNodeRuleProvider getCompanyDescriptionNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyDescriptionNodeModule(CompanyDescriptionNodeModule module);

        CompanyDescriptionNodeComponent build();
    }
}

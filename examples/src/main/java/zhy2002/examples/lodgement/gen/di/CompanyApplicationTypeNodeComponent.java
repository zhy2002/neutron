package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CompanyApplicationTypeNodeScope
@Subcomponent(modules = {CompanyApplicationTypeNodeModule.class})
public interface CompanyApplicationTypeNodeComponent {

    CompanyApplicationTypeNodeRuleProvider getCompanyApplicationTypeNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyApplicationTypeNodeModule(CompanyApplicationTypeNodeModule module);

        CompanyApplicationTypeNodeComponent build();
    }
}

package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CompanyRegisteredNameNodeScope
@Subcomponent(modules = {CompanyRegisteredNameNodeModule.class})
public interface CompanyRegisteredNameNodeComponent {

    CompanyRegisteredNameNodeRuleProvider getCompanyRegisteredNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyRegisteredNameNodeModule(CompanyRegisteredNameNodeModule module);

        CompanyRegisteredNameNodeComponent build();
    }
}

package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CompanyAcnNodeScope
@Subcomponent(modules = {CompanyAcnNodeModule.class})
public interface CompanyAcnNodeComponent {

    CompanyAcnNodeRuleProvider getCompanyAcnNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyAcnNodeModule(CompanyAcnNodeModule module);

        CompanyAcnNodeComponent build();
    }
}

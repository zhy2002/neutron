package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CompanySelectDirectorNodeScope
@Subcomponent(modules = {CompanySelectDirectorNodeModule.class})
public interface CompanySelectDirectorNodeComponent {

    CompanySelectDirectorNodeRuleProvider getCompanySelectDirectorNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanySelectDirectorNodeModule(CompanySelectDirectorNodeModule module);

        CompanySelectDirectorNodeComponent build();
    }
}
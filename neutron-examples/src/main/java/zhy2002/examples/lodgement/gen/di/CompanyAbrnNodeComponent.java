package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CompanyAbrnNodeScope
@Subcomponent(modules = {CompanyAbrnNodeModule.class})
public interface CompanyAbrnNodeComponent {

    CompanyAbrnNodeRuleProvider getCompanyAbrnNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyAbrnNodeModule(CompanyAbrnNodeModule module);

        CompanyAbrnNodeComponent build();
    }
}

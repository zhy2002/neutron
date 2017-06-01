package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;


@ComponentScope
@Subcomponent(modules = {CompanyAbrnNodeModule.class})
public interface CompanyAbrnNodeComponent {

    List<RuleProvider<CompanyAbrnNode>> provideRuleProviders();


    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyAbrnNodeModule(CompanyAbrnNodeModule module);

        CompanyAbrnNodeComponent build();
    }

}

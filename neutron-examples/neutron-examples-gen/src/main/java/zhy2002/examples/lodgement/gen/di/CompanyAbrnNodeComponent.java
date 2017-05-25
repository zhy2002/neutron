package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyAbrnNodeScope
@Subcomponent(modules = {CompanyAbrnNodeModule.class})
public interface CompanyAbrnNodeComponent {

    RuleProvider<CompanyAbrnNode> getCompanyAbrnNodeRuleProvider();
    Map<String, RuleProvider<CompanyAbrnNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyAbrnNodeModule(CompanyAbrnNodeModule module);

        CompanyAbrnNodeComponent build();
    }
}

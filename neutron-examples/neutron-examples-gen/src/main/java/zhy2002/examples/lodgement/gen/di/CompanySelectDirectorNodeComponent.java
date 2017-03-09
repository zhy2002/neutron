package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanySelectDirectorNodeScope
@Subcomponent(modules = {CompanySelectDirectorNodeModule.class})
public interface CompanySelectDirectorNodeComponent {

    CompanySelectDirectorNodeRuleProvider getCompanySelectDirectorNodeRuleProvider();
    Map<String, RuleProvider<CompanySelectDirectorNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanySelectDirectorNodeModule(CompanySelectDirectorNodeModule module);

        CompanySelectDirectorNodeComponent build();
    }
}

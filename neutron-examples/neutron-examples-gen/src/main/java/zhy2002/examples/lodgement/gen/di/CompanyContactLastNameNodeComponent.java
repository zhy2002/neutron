package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyContactLastNameNodeScope
@Subcomponent(modules = {CompanyContactLastNameNodeModule.class})
public interface CompanyContactLastNameNodeComponent {

    CompanyContactLastNameNodeRuleProvider getCompanyContactLastNameNodeRuleProvider();
    Map<String, RuleProvider<CompanyContactLastNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyContactLastNameNodeModule(CompanyContactLastNameNodeModule module);

        CompanyContactLastNameNodeComponent build();
    }
}

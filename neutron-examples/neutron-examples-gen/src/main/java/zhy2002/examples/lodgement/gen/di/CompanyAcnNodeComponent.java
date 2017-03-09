package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyAcnNodeScope
@Subcomponent(modules = {CompanyAcnNodeModule.class})
public interface CompanyAcnNodeComponent {

    CompanyAcnNodeRuleProvider getCompanyAcnNodeRuleProvider();
    Map<String, RuleProvider<CompanyAcnNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyAcnNodeModule(CompanyAcnNodeModule module);

        CompanyAcnNodeComponent build();
    }
}

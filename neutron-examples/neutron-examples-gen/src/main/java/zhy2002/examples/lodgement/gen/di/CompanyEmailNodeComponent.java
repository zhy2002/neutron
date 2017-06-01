package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CompanyEmailNodeModule.class})
public interface CompanyEmailNodeComponent {


    RuleProvider<CompanyEmailNode> getCompanyEmailNodeRuleProvider();
    Map<String, RuleProvider<CompanyEmailNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyEmailNodeModule(CompanyEmailNodeModule module);

        CompanyEmailNodeComponent build();
    }

}

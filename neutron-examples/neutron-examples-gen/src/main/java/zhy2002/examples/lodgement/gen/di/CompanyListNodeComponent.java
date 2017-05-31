package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {CompanyListNodeModule.class})
public interface CompanyListNodeComponent {

    RuleProvider<CompanyListNode> getCompanyListNodeRuleProvider();
    Map<String, RuleProvider<CompanyListNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyListNodeModule(CompanyListNodeModule module);

        CompanyListNodeComponent build();
    }
}

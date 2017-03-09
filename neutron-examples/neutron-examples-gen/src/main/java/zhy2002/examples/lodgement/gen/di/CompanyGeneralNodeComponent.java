package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyGeneralNodeScope
@Subcomponent(modules = {CompanyGeneralNodeModule.class})
public interface CompanyGeneralNodeComponent {

    CompanyGeneralNodeRuleProvider getCompanyGeneralNodeRuleProvider();
    Map<String, RuleProvider<CompanyGeneralNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyGeneralNodeModule(CompanyGeneralNodeModule module);

        CompanyGeneralNodeComponent build();
    }
}

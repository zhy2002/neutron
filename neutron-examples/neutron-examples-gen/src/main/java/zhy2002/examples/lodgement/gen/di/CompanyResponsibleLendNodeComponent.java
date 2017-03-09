package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@CompanyResponsibleLendNodeScope
@Subcomponent(modules = {CompanyResponsibleLendNodeModule.class})
public interface CompanyResponsibleLendNodeComponent {

    CompanyResponsibleLendNodeRuleProvider getCompanyResponsibleLendNodeRuleProvider();
    Map<String, RuleProvider<CompanyResponsibleLendNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyResponsibleLendNodeModule(CompanyResponsibleLendNodeModule module);

        CompanyResponsibleLendNodeComponent build();
    }
}

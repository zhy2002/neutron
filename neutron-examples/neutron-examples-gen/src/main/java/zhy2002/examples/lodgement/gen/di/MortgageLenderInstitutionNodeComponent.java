package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {MortgageLenderInstitutionNodeModule.class})
public interface MortgageLenderInstitutionNodeComponent {

    RuleProvider<MortgageLenderInstitutionNode> getMortgageLenderInstitutionNodeRuleProvider();
    Map<String, RuleProvider<MortgageLenderInstitutionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageLenderInstitutionNodeModule(MortgageLenderInstitutionNodeModule module);

        MortgageLenderInstitutionNodeComponent build();
    }
}

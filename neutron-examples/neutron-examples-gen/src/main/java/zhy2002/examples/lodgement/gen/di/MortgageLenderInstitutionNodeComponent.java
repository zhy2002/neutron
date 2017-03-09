package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@MortgageLenderInstitutionNodeScope
@Subcomponent(modules = {MortgageLenderInstitutionNodeModule.class})
public interface MortgageLenderInstitutionNodeComponent {

    MortgageLenderInstitutionNodeRuleProvider getMortgageLenderInstitutionNodeRuleProvider();
    Map<String, RuleProvider<MortgageLenderInstitutionNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setMortgageLenderInstitutionNodeModule(MortgageLenderInstitutionNodeModule module);

        MortgageLenderInstitutionNodeComponent build();
    }
}

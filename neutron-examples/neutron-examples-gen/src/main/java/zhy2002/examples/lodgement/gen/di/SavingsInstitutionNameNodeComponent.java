package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.neutron.di.ComponentScope;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@ComponentScope
@Subcomponent(modules = {SavingsInstitutionNameNodeModule.class})
public interface SavingsInstitutionNameNodeComponent {


    RuleProvider<SavingsInstitutionNameNode> getSavingsInstitutionNameNodeRuleProvider();
    Map<String, RuleProvider<SavingsInstitutionNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsInstitutionNameNodeModule(SavingsInstitutionNameNodeModule module);

        SavingsInstitutionNameNodeComponent build();
    }

}

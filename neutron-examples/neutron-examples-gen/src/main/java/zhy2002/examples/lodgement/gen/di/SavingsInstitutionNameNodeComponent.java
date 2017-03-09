package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.RuleProvider;
import java.util.*;

@SavingsInstitutionNameNodeScope
@Subcomponent(modules = {SavingsInstitutionNameNodeModule.class})
public interface SavingsInstitutionNameNodeComponent {

    SavingsInstitutionNameNodeRuleProvider getSavingsInstitutionNameNodeRuleProvider();
    Map<String, RuleProvider<SavingsInstitutionNameNode>> getInstanceRuleProviders();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsInstitutionNameNodeModule(SavingsInstitutionNameNodeModule module);

        SavingsInstitutionNameNodeComponent build();
    }
}

package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@SavingsInstitutionNameNodeScope
@Subcomponent(modules = {SavingsInstitutionNameNodeModule.class})
public interface SavingsInstitutionNameNodeComponent {

    SavingsInstitutionNameNodeRuleProvider getSavingsInstitutionNameNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setSavingsInstitutionNameNodeModule(SavingsInstitutionNameNodeModule module);

        SavingsInstitutionNameNodeComponent build();
    }
}

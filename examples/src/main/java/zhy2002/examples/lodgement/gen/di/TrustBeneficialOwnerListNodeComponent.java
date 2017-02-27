package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@TrustBeneficialOwnerListNodeScope
@Subcomponent(modules = {TrustBeneficialOwnerListNodeModule.class})
public interface TrustBeneficialOwnerListNodeComponent {

    TrustBeneficialOwnerListNodeRuleProvider getTrustBeneficialOwnerListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustBeneficialOwnerListNodeModule(TrustBeneficialOwnerListNodeModule module);

        TrustBeneficialOwnerListNodeComponent build();
    }
}

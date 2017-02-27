package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@TrustRegistrationDateNodeScope
@Subcomponent(modules = {TrustRegistrationDateNodeModule.class})
public interface TrustRegistrationDateNodeComponent {

    TrustRegistrationDateNodeRuleProvider getTrustRegistrationDateNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustRegistrationDateNodeModule(TrustRegistrationDateNodeModule module);

        TrustRegistrationDateNodeComponent build();
    }
}

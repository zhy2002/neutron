package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@TrustAddressNodeScope
@Subcomponent(modules = {TrustAddressNodeModule.class})
public interface TrustAddressNodeComponent {

    TrustAddressNodeRuleProvider getTrustAddressNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustAddressNodeModule(TrustAddressNodeModule module);

        TrustAddressNodeComponent build();
    }
}

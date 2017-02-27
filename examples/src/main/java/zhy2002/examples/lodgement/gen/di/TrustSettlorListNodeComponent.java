package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@TrustSettlorListNodeScope
@Subcomponent(modules = {TrustSettlorListNodeModule.class})
public interface TrustSettlorListNodeComponent {

    TrustSettlorListNodeRuleProvider getTrustSettlorListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setTrustSettlorListNodeModule(TrustSettlorListNodeModule module);

        TrustSettlorListNodeComponent build();
    }
}

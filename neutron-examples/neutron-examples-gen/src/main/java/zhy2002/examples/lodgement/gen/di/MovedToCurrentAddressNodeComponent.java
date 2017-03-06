package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@MovedToCurrentAddressNodeScope
@Subcomponent(modules = {MovedToCurrentAddressNodeModule.class})
public interface MovedToCurrentAddressNodeComponent {

    MovedToCurrentAddressNodeRuleProvider getMovedToCurrentAddressNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMovedToCurrentAddressNodeModule(MovedToCurrentAddressNodeModule module);

        MovedToCurrentAddressNodeComponent build();
    }
}

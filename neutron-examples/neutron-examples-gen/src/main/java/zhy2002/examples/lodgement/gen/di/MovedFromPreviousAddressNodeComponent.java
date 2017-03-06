package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.node.*;

@MovedFromPreviousAddressNodeScope
@Subcomponent(modules = {MovedFromPreviousAddressNodeModule.class})
public interface MovedFromPreviousAddressNodeComponent {

    MovedFromPreviousAddressNodeRuleProvider getMovedFromPreviousAddressNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMovedFromPreviousAddressNodeModule(MovedFromPreviousAddressNodeModule module);

        MovedFromPreviousAddressNodeComponent build();
    }
}

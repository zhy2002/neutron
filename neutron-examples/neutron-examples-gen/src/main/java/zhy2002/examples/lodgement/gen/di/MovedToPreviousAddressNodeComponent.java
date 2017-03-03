package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@MovedToPreviousAddressNodeScope
@Subcomponent(modules = {MovedToPreviousAddressNodeModule.class})
public interface MovedToPreviousAddressNodeComponent {

    MovedToPreviousAddressNodeRuleProvider getMovedToPreviousAddressNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setMovedToPreviousAddressNodeModule(MovedToPreviousAddressNodeModule module);

        MovedToPreviousAddressNodeComponent build();
    }
}

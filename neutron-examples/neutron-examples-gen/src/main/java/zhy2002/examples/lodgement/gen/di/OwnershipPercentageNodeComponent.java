package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OwnershipPercentageNodeScope
@Subcomponent(modules = {OwnershipPercentageNodeModule.class})
public interface OwnershipPercentageNodeComponent {

    OwnershipPercentageNodeRuleProvider getOwnershipPercentageNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOwnershipPercentageNodeModule(OwnershipPercentageNodeModule module);

        OwnershipPercentageNodeComponent build();
    }
}

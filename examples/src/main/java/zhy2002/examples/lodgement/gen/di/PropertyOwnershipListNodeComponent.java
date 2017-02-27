package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@PropertyOwnershipListNodeScope
@Subcomponent(modules = {PropertyOwnershipListNodeModule.class})
public interface PropertyOwnershipListNodeComponent {

    PropertyOwnershipListNodeRuleProvider getPropertyOwnershipListNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setPropertyOwnershipListNodeModule(PropertyOwnershipListNodeModule module);

        PropertyOwnershipListNodeComponent build();
    }
}

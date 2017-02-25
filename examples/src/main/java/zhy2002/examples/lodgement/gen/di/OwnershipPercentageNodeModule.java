package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OwnershipPercentageNodeModule {

    private final OwnershipPercentageNode owner;

    public OwnershipPercentageNodeModule(OwnershipPercentageNode owner) {
        this.owner = owner;
    }

    @Provides @OwnershipPercentageNodeScope @Owner OwnershipPercentageNode provideOwnershipPercentageNode() {
        return owner;
    }

    @Provides @OwnershipPercentageNodeScope @Owner BasePercentageNode<?> provideBasePercentageNode() {
        return owner;
    }

    @Provides @OwnershipPercentageNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @OwnershipPercentageNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OwnershipPercentageNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}
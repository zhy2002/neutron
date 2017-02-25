package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OwnershipNodeModule {

    private final OwnershipNode owner;

    public OwnershipNodeModule(OwnershipNode owner) {
        this.owner = owner;
    }

    @Provides @OwnershipNodeScope @Owner OwnershipNode provideOwnershipNode() {
        return owner;
    }

    @Provides @OwnershipNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @OwnershipNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @OwnershipNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}
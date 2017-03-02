package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class RentedFlagNodeModule {

    private final RentedFlagNode owner;

    public RentedFlagNodeModule(RentedFlagNode owner) {
        this.owner = owner;
    }

    @Provides @RentedFlagNodeScope @Owner RentedFlagNode provideRentedFlagNode() {
        return owner;
    }

    @Provides @RentedFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @RentedFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @RentedFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}
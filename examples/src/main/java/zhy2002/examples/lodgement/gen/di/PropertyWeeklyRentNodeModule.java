package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class PropertyWeeklyRentNodeModule {

    private final PropertyWeeklyRentNode owner;

    public PropertyWeeklyRentNodeModule(PropertyWeeklyRentNode owner) {
        this.owner = owner;
    }

    @Provides @PropertyWeeklyRentNodeScope @Owner PropertyWeeklyRentNode providePropertyWeeklyRentNode() {
        return owner;
    }

    @Provides @PropertyWeeklyRentNodeScope @Owner BigDecimalUiNode<?> provideBigDecimalUiNode() {
        return owner;
    }

    @Provides @PropertyWeeklyRentNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @PropertyWeeklyRentNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}
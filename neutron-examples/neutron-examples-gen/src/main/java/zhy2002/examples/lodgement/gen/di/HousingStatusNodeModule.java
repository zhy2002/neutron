package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class HousingStatusNodeModule {

    private final HousingStatusNode owner;

    public HousingStatusNodeModule(HousingStatusNode owner) {
        this.owner = owner;
    }

    @Provides @HousingStatusNodeScope @Owner HousingStatusNode provideHousingStatusNode() {
        return owner;
    }

    @Provides @HousingStatusNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @HousingStatusNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @HousingStatusNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}
package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class HouseDutiesFlagNodeModule {

    private final HouseDutiesFlagNode owner;

    public HouseDutiesFlagNodeModule(HouseDutiesFlagNode owner) {
        this.owner = owner;
    }

    @Provides @HouseDutiesFlagNodeScope @Owner HouseDutiesFlagNode provideHouseDutiesFlagNode() {
        return owner;
    }

    @Provides @HouseDutiesFlagNodeScope @Owner YesNoOptionNode<?> provideYesNoOptionNode() {
        return owner;
    }

    @Provides @HouseDutiesFlagNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @HouseDutiesFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @HouseDutiesFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}
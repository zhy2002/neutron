package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class LiabilitiesNodeModule {

    private final LiabilitiesNode owner;

    public LiabilitiesNodeModule(LiabilitiesNode owner) {
        this.owner = owner;
    }

    @Provides @LiabilitiesNodeScope @Owner LiabilitiesNode provideLiabilitiesNode() {
        return owner;
    }

    @Provides @LiabilitiesNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @LiabilitiesNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @LiabilitiesNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}
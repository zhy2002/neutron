package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ThirdPartyDisclosureFlagNodeModule {

    private final ThirdPartyDisclosureFlagNode owner;

    public ThirdPartyDisclosureFlagNodeModule(ThirdPartyDisclosureFlagNode owner) {
        this.owner = owner;
    }

    @Provides @ThirdPartyDisclosureFlagNodeScope @Owner ThirdPartyDisclosureFlagNode provideThirdPartyDisclosureFlagNode() {
        return owner;
    }

    @Provides @ThirdPartyDisclosureFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @ThirdPartyDisclosureFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ThirdPartyDisclosureFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}
package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ThirdPartyEmailNodeModule {

    private final ThirdPartyEmailNode owner;

    public ThirdPartyEmailNodeModule(ThirdPartyEmailNode owner) {
        this.owner = owner;
    }

    @Provides @ThirdPartyEmailNodeScope @Owner ThirdPartyEmailNode provideThirdPartyEmailNode() {
        return owner;
    }

    @Provides @ThirdPartyEmailNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ThirdPartyEmailNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ThirdPartyEmailNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}
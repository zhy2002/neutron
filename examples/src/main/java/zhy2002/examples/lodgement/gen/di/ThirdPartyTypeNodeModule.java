package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ThirdPartyTypeNodeModule {

    private final ThirdPartyTypeNode owner;

    public ThirdPartyTypeNodeModule(ThirdPartyTypeNode owner) {
        this.owner = owner;
    }

    @Provides @ThirdPartyTypeNodeScope @Owner ThirdPartyTypeNode provideThirdPartyTypeNode() {
        return owner;
    }

    @Provides @ThirdPartyTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ThirdPartyTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ThirdPartyTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}
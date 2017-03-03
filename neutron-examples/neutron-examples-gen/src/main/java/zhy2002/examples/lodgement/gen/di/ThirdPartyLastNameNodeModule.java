package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class ThirdPartyLastNameNodeModule {

    private final ThirdPartyLastNameNode owner;

    public ThirdPartyLastNameNodeModule(ThirdPartyLastNameNode owner) {
        this.owner = owner;
    }

    @Provides @ThirdPartyLastNameNodeScope @Owner ThirdPartyLastNameNode provideThirdPartyLastNameNode() {
        return owner;
    }

    @Provides @ThirdPartyLastNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @ThirdPartyLastNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @ThirdPartyLastNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}
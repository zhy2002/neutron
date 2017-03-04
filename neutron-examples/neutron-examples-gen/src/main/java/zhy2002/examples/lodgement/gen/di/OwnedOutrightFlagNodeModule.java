package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class OwnedOutrightFlagNodeModule {

    private final OwnedOutrightFlagNode owner;

    public OwnedOutrightFlagNodeModule(OwnedOutrightFlagNode owner) {
        this.owner = owner;
    }

    @Provides @OwnedOutrightFlagNodeScope @Owner OwnedOutrightFlagNode provideOwnedOutrightFlagNode() {
        return owner;
    }

    @Provides @OwnedOutrightFlagNodeScope @Owner BooleanUiNode<?> provideBooleanUiNode() {
        return owner;
    }

    @Provides @OwnedOutrightFlagNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @OwnedOutrightFlagNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @OwnedOutrightFlagNodeScope UsageNode provideUsageNode() {
        return owner.getParent();
    }

}
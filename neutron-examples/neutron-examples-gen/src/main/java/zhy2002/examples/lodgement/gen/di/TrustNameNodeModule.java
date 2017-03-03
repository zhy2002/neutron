package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class TrustNameNodeModule {

    private final TrustNameNode owner;

    public TrustNameNodeModule(TrustNameNode owner) {
        this.owner = owner;
    }

    @Provides @TrustNameNodeScope @Owner TrustNameNode provideTrustNameNode() {
        return owner;
    }

    @Provides @TrustNameNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @TrustNameNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TrustNameNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}
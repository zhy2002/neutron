package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class TrustTypeNodeModule {

    private final TrustTypeNode owner;

    public TrustTypeNodeModule(TrustTypeNode owner) {
        this.owner = owner;
    }

    @Provides @TrustTypeNodeScope @Owner TrustTypeNode provideTrustTypeNode() {
        return owner;
    }

    @Provides @TrustTypeNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @TrustTypeNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TrustTypeNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}
package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class TrustIndustryNodeModule {

    private final TrustIndustryNode owner;

    public TrustIndustryNodeModule(TrustIndustryNode owner) {
        this.owner = owner;
    }

    @Provides @TrustIndustryNodeScope @Owner TrustIndustryNode provideTrustIndustryNode() {
        return owner;
    }

    @Provides @TrustIndustryNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @TrustIndustryNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @TrustIndustryNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}
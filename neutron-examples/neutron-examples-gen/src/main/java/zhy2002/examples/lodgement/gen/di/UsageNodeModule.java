package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.node.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class UsageNodeModule {

    private final UsageNode owner;

    public UsageNodeModule(UsageNode owner) {
        this.owner = owner;
    }

    @Provides @UsageNodeScope @Owner UsageNode provideUsageNode() {
        return owner;
    }

    @Provides @UsageNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @UsageNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @UsageNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

    @Provides @UsageNodeScope RealEstateNode provideRealEstateNode() {
        return owner.getParent();
    }

}
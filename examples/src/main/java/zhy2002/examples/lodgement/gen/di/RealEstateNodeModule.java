package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class RealEstateNodeModule {

    private final RealEstateNode owner;

    public RealEstateNodeModule(RealEstateNode owner) {
        this.owner = owner;
    }

    @Provides @RealEstateNodeScope @Owner RealEstateNode provideRealEstateNode() {
        return owner;
    }

    @Provides @RealEstateNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @RealEstateNodeScope @Owner ParentUiNode<?> provideParentUiNode() {
        return owner;
    }

    @Provides @RealEstateNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }

}
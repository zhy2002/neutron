package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AdditionalNodeModule {

    private final AdditionalNode owner;

    public AdditionalNodeModule(AdditionalNode owner) {
        this.owner = owner;
    }

    @Provides @AdditionalNodeScope @Owner AdditionalNode provideAdditionalNode() {
        return owner;
    }

    @Provides @AdditionalNodeScope @Owner ObjectUiNode<?> provideObjectUiNode() {
        return owner;
    }

    @Provides @AdditionalNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}
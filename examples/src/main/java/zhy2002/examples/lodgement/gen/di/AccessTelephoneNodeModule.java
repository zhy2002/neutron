package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.neutron.*;
import zhy2002.neutron.node.*;
import zhy2002.neutron.di.*;

@Module
public class AccessTelephoneNodeModule {

    private final AccessTelephoneNode owner;

    public AccessTelephoneNodeModule(AccessTelephoneNode owner) {
        this.owner = owner;
    }

    @Provides @AccessTelephoneNodeScope @Owner AccessTelephoneNode provideAccessTelephoneNode() {
        return owner;
    }

    @Provides @AccessTelephoneNodeScope @Owner StringUiNode<?> provideStringUiNode() {
        return owner;
    }

    @Provides @AccessTelephoneNodeScope @Owner LeafUiNode<?,?> provideLeafUiNode() {
        return owner;
    }

    @Provides @AccessTelephoneNodeScope @Owner UiNode<?> provideUiNode() {
        return owner;
    }



}